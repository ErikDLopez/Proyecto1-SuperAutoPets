
package com.functionalities.store;

import com.animals.Pet;
import com.functionalities.actions.SelectPet;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;

/**
 * Clase donde se realizan los procesos y acciones relacionados a la tienda al inicio y entre cada batalla del juego 
 *  
 * @author Erik David Lopez
 * 
 */
public class Store {
    Validation validate = new Validation();
    SelectPet selectPet = new SelectPet();
    StoreAction storeAction = new StoreAction();
    
    public static Pet[] petsStore;
    public static Pet[] pets;
    public static int gold;

    public static Pet[] getPetsStore() {
        return petsStore;
    }

    public static void setPetsStore(Pet[] petsStore) {
        Store.petsStore = petsStore;
    }

    public static Pet[] getPets() {
        return pets;
    }

    public static void setPets(Pet[] pets) {
        Store.pets = pets;
    }
    
    
    public static int getGold() {
        return gold;
    }

    public static void setGold(int gold) {
        Store.gold = gold;
    }

    
    public void startStore(Pet[] pets, int round, int lifes, int cups){
        this.pets = pets;
        petsStore = new Pet[determineLengthPetsStore(round)];
        generatePetsStore(round);
        
        storeAction.showStore(round, lifes, cups);
    }
    
    public void generatePetsStore(int round){
        int numberOfPets = determineTierPets(round);
        
        for (int i = 0; i < petsStore.length; i++) {
            int petID = validate.randomNumber(1, numberOfPets);
            petsStore[i] = selectPet.definePet(petID);
        }
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
