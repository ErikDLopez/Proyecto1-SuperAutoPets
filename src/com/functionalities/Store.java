package com.functionalities;

import com.animals.Pet;
import com.functionalities.actions.SelectPet;
import com.functionalities.actions.StoreAction;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;

/**
 * Clase donde se realizan los procesos y acciones relacionados a la tienda al inicio y entre cada batalla del juego 
 *  
 * @author Erik David Lopez
 * 
 */
public class Store {
    Pet[] petsStore,pets;
    Validation validate = new Validation();
    SelectPet selectPet = new SelectPet();
    GUI gui = new GUI();
    StoreAction storeAction = new StoreAction();
    
    public void startStore(Pet[] pets, int round, int lifes, int cups){
        this.pets = pets;
        int gold = 10;
        boolean openStore = true;
        petsStore = new Pet[determineLengthPetsStore(round)];
        generatePetsStore(round);
        
        while (openStore) {            
            System.out.println("\nVidas: "+lifes);
            System.out.println("Ronda: "+round);
            System.out.println("Copas: "+cups);
            showPets(this.pets);
            
            System.out.println("\nTienda de Mascotas:");
            showPetsAvailable();
            openStore = storeMenu();
            gui.clearConsole();
        }
        
        
    }
    
    public void generatePetsStore(int round){
        int numberOfPets = determineTierPets(round);
        
        for (int i = 0; i < petsStore.length; i++) {
            int petID = validate.randomNumber(1, numberOfPets);
            petsStore[i] = selectPet.definePet(petID);
        }
    }
    
    public void showPets(Pet[] pets){
        System.out.println("\nMIS MASCOTAS");
        int position = 1;
        for (int i = 0; i < pets.length; i++) {
            System.out.print(position+"  ");
            pets[i].showStats();
            position++;
        }
    }
    
    public void showPetsAvailable(){
        int position = 1;
        
        for (int i = 0; i < petsStore.length; i++) {
            System.out.print(position+".  ");
            petsStore[i].showStats();
            position++;
        }
    }
    
    public boolean storeMenu(){
        int option;
        
        gui.title("ACCIONES");
        gui.menuOption(1,"COMPRAR MASCOTA");
        gui.menuOption(2,"VENDER MASCOTA");
        gui.menuOption(3,"MEZCLAR");
        gui.menuOption(4,"TERMINAR TURNO");
        option = validate.validateNumber("Seleccione una opcion: ",1,4);
        boolean repeat = storeMenuOptions(option);
        
        return repeat;
    }
    
    public boolean storeMenuOptions(int option){
        boolean repeat = true;
        
        switch(option){
            case 1:
                buyPet();
                break;
            case 2:
                sellPet();
                break;
            case 3:
                rollPets();
                break;
            case 4:
                System.out.println("Buscando combate");
                repeat = false;
                break;
        }
        return repeat;
    }
    
    public void buyPet(){
        pets = storeAction.buyPet(pets,petsStore);
    }
    public void sellPet(){
        System.out.println("VENDER MASCOTA");
    }
    public void rollPets(){
        System.out.println("MEZCLAR MASCOTAS");
    }
    
    public int determineLengthPetsStore(int round){
        int length = 0;
        
        if (round > 0 && round < 5) {
            length = 3;
        }
        if (round >= 5 && round < 9) {
            length = 4;
        }
        if (round >= 9) {
            length = 5;
        }
        return length;
    }
    
    public int determineTierPets(int round){
        int upperBound = 0;
        
        if (round >= 0 && round < 2) {
            //tier1
            upperBound = 8;
        }
        if (round >= 2 && round < 4) {
            upperBound = 16;
        }
        if (round >= 4 && round < 6) {
            upperBound = 27;
        }
        if (round >= 6 && round < 8) {
            upperBound = 35;
        }
        if (round >= 8 && round < 10) {
            upperBound = 43;
        }
        if (round >= 10 && round < 12) {
            upperBound = 52;
        }
        if (round >= 12) {
            upperBound = 54;
        }
        return upperBound;
    }
}
