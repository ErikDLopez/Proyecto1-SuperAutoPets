
package com.functionalities.actions;

import com.animals.NullPet;
import com.animals.Pet;
import com.functionalities.utilities.Validation;

/**
 * Clase en la cual se establecen los metodos necesarios para la compra, movimiento y venta de mascotas en la tienda del juego
 * 
 * @author erik-lopez
 */
public class StoreAction {
    Validation validate = new Validation();
    Pet[] pets,petsStore;
    
    public Pet[] buyPet(Pet[] pets,Pet[] petsStore){
        this.petsStore = petsStore;
        this.pets = pets;
        
        System.out.println("\nCOMPRAR MASCOTA");
        int numberPet = validate.validateNumber("No. de mascota que comprará: ", 1, pets.length);
        int positionPet = validate.validateNumber("Posición donde ubicará a la mascota: ", 1, 5);
        
        confirmBuy(numberPet, positionPet);
        return this.pets;
    }
    
    public void confirmBuy(int numberPet, int positionPet){
        pets[(positionPet-1)] = petsStore[(numberPet-1)];
        //petsStore[numberPet] = new NullPet();
    }
    
    public void sellPet(){
    
    }
    
    
    
    public void movePet(){
    
    }
    
    
}
