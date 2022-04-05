package com.functionalities.store;

import com.animals.NullPet;
import com.animals.Pet;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;

/**
 * Clase donde se definen los metodos necesarios para el proceso de compra de las mascotas y de las comidas
 * 
 * @author Erik David Lopez
 */
public class BuyAtStore {
    Validation validate = new Validation();
    Pet[] pets,petsStore;
    GUI gui = new GUI();
    
    public void buy(Pet[] pets,Pet[] petsStore,int gold){
        this.petsStore = petsStore;
        this.pets = pets;
        
        if (gold >= 3) {
            purchaseOptionMenu();
        } else {
            System.out.println("\nNo tienes el dinero suficiente para comprar");
            validate.enterToContinue();
        }
    }
    
    public void purchaseOptionMenu(){
        gui.title("COMPRAR");
        gui.menuOption(1,"Comprar mascota");
        gui.menuOption(2,"Comprar comida");
        int option = validate.validateNumber("Seleccione una opcion: ",1,2);
        
        switch (option) {
            case 1:
                buyAPet();
                break;
            case 2:
                buyAFood();
                break;
        }
    }
    
    public void buyAPet(){
        System.out.println("\nCOMPRAR MASCOTA");
        int numberPet = validate.validateNumber("No. de mascota que comprará: ", 1, pets.length);
        checkPetStore(numberPet);
    }
    
    public void buyAFood(){
        
    }
    
    public void checkPetStore(int numberPet){
        numberPet--;
        int petID = petsStore[numberPet].getPetID();
        
        
        if (petID == 0){
            System.out.println("\nNo hay mascota en esta posicion");
            validate.enterToContinue();
        } else {
            int positionPet = validate.validateNumber("Posición donde ubicará a la mascota: ", 1, 5);
            checkSpaceFull(numberPet, positionPet);
        }
    }
    
    public void checkSpaceFull(int numberPet, int positionPet){
        positionPet--;
        int petStoreID = petsStore[numberPet].getPetID();
        int petID = pets[positionPet].getPetID();
        
        if ((petStoreID != petID) && (petID != 0)) {
            System.out.println("\nEspacio lleno, las mascotas no son iguales para poder fusionarlas");
            validate.enterToContinue();
        } else {
            confirmBuy(numberPet, positionPet,petID,petStoreID);
        }
    }
    
    public void confirmBuy(int numberPet, int positionPet,int petID,int petStoreID){
        int gold = Store.getGold()-3;
        
        if (petID == petStoreID) {
            mergePets(positionPet);
        } else {
            pets[positionPet] = petsStore[numberPet];
        }
        petsStore[numberPet] = new NullPet();
        Store.setPets(pets);
        Store.setPetsStore(petsStore);
        Store.setGold(gold);
    }
    
    public void mergePets(int positionPet){
        int attack = pets[positionPet].getAttackPoints();
        int life = pets[positionPet].getLifePoints();
        attack++;
        life++;
        levelUp(positionPet);
        pets[positionPet].setAttackPoints(attack);
        pets[positionPet].setLifePoints(life);
        System.out.println("\nMascota Fusionada");
        validate.enterToContinue();
    }
    public void levelUp(int positionPet){
        int levelProgress = pets[positionPet].getLevelProgress();
        levelProgress++;
        pets[positionPet].setLevelProgress(levelProgress);
        pets[positionPet].levelUp(levelProgress);
        
    }
    
}
