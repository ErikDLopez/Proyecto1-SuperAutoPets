package com.functionalities.combats;

import com.animals.Pet;
import com.functionalities.actions.Fight;
import com.functionalities.actions.SelectPet;
import com.functionalities.stages.maps.Map;
import com.functionalities.store.Store;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;
import com.functionalities.utilities.interfaces.Color;

/**
 * Clase que posee los metodos necesarios para la realizacion del modo arena de juego
 * 
 * @author Erik David Lopez
 * 
 */
public class ArenaMode implements Color{
    
    Validation validate = new Validation();
    SelectPet selectPet = new SelectPet();
    Store store = new Store();
    Fight fight = new Fight();
    GUI gui = new GUI();
    Map map = new Map();
    
    Pet[] pets = new Pet[5];
    Pet[] enemyPets = new Pet[5];
    
    public void startGame(){
        int playerLife = 10;
        int round = 12;
        int cups = 0;
        pets = nullPets(pets.length);
        enemyPets = nullPets(enemyPets.length);
        
        /*while (playerLife > 0) {            
            
        }*/
        
        startStore(playerLife, round, cups);
        
        
        
        
        /*gui.sleepProcess(1000);
        pets = defineGroupPets("MIS MASCOTAS",pets.length);
        gui.sleepProcess(1000);
        enemyPets = defineGroupPets("MASCOTAS ENEMIGAS", enemyPets.length);
        gui.sleepProcess(1000);
        fight();*/
    }
    
    public void startStore(int playerLife, int round, int cups){
        store.startStore(pets,round,playerLife,cups);
        
    }
    public Pet[] nullPets(int lenghtPets){
        Pet[] pets = new Pet[lenghtPets];
       
        for (int i = 0; i < lenghtPets; i++) {
            pets[i] = selectPet.definePet(0);
        }
        return pets;
    }
    
    public Pet[] defineGroupPets(String message,int lenghtPets){
        Pet[] pets = new Pet[lenghtPets];
        gui.title(message);
        for (int i = 0; i < lenghtPets; i++) {
            int petID = validate.randomNumber(1, 10);
            pets[i] = selectPet.definePet(petID);
            pets[i].showStats();
        }
        return pets;
    }
    
    public void fight(){
        boolean petsAlive = true;
        boolean enemyPetsAlive =  true;
        int petPosition = 0, enemyPetPosition = 0;
        int numberOfPets = 5, numberOfEnemyPets = 5;
        
        while (numberOfPets != 0 && numberOfEnemyPets != 0) {     
            gui.sleepProcess(1000);
            System.out.println(GREEN+"\n                             --- COMBATE ---"+RESET);
            //map.generateMap(pets, enemyPets,petPosition,enemyPetPosition);
            gui.sleepProcess(1000);
            System.out.println();
            
            enemyPetsAlive = petsFighting(2, petPosition, enemyPetPosition);
            petsAlive = petsFighting(1, petPosition,enemyPetPosition);
            fight.determineWinningPet(petPosition,enemyPetPosition, pets, enemyPets);
            
            petPosition = fight.nextPet(petsAlive, petPosition);
            enemyPetPosition = fight.nextPet(enemyPetsAlive, enemyPetPosition);
            numberOfPets = fight.reduceNumberOfPets(petsAlive, numberOfPets);
            numberOfEnemyPets = fight.reduceNumberOfPets(enemyPetsAlive, numberOfEnemyPets);
            System.out.println("Mascota No. "+petPosition+"  Mascota enemiga No. "+enemyPetPosition);
            gui.sleepProcess(1000);
            gui.clearConsole();
        }
        fight.determineWinningPlayer(numberOfPets, numberOfEnemyPets);
        
    }
    
    public boolean petsFighting(int petID, int petPos,int enemyPetPos){
        boolean petAlive = true;
        
        switch(petID){ 
            case 2: //la opcion es para que las mascotas enemigas reciban daño y se verifique si fue noqueada
                enemyPets[enemyPetPos] = fight.receiveDamage(petPos, enemyPetPos, pets, enemyPets);
                petAlive = fight.knockedOutPet(enemyPets[enemyPetPos]);
                break;
            case 1: //la opcion es para que las mascotas amigas reciban daño y se verifique si fue noqueada
                pets[petPos] = fight.receiveDamage(enemyPetPos, petPos, enemyPets, pets);
                petAlive = fight.knockedOutPet(pets[petPos]);
                break;
        }
        return petAlive;
    }
    
}
