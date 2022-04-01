package com.functionalities;

import com.animals.Pet;
import com.functionalities.actions.SelectPet;
import com.functionalities.utilities.Validation;

/**
 * Clase donde se realizan los procesos y acciones relacionados a la tienda al inicio y entre cada batalla del juego 
 *  
 * @author Erik David Lopez
 * 
 */
public class Store {
    Pet[] petsStore;
    Validation validate = new Validation();
    SelectPet selectPet = new SelectPet();
    
    public void showPets(Pet[] pets){
        System.out.println("\nMIS MASCOTAS");
        for (int i = 0; i < pets.length; i++) {
            pets[i].showStats();
        }
    }
    public void startStore(Pet[] pets, int round, int lifes, int cups){
        System.out.println("Vidas: "+lifes);
        System.out.println("Ronda: "+round);
        System.out.println("Copas: "+cups);
        showPets(pets);
        System.out.println("\nTienda de Mascotas:");
        petsStore = new Pet[determineLengthPets(round)];
        
        petsAvailable(round);
        
    }
    
    public void petsAvailable(int round){
        int numberOfPets = determineTierPets(round);
        
        for (int i = 0; i < petsStore.length; i++) {
            int petID = validate.randomNumber(1, numberOfPets);
            petsStore[i] = selectPet.definePet(petID);
            petsStore[i].showStats();
        }
    }
    
    public int determineLengthPets(int round){
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
