
package com.functionalities.store;

import com.animals.NullPet;
import com.animals.Pet;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;

/**
 *
 * @author erik-lopez
 */
public class SellPet {
    GUI gui = new GUI();
    Validation validate = new Validation();
    
    public void sell(Pet[] pets){
        gui.title("VENDER MASCOTA");
        int positionPet = validate.validateNumber("No. de la mascota: ",1,5);
        positionPet--;
        int petID = pets[positionPet].getPetID();
        
        if(petID == 0) {
            System.out.println("\nNo hay ninguna mascota para vender en el lugar");
            validate.enterToContinue();
        } else {
            pets = confirmSale(pets, positionPet);
        }
        
        Store.setPets(pets);
    }
    
    public Pet[] confirmSale(Pet[] pets, int positionPet){
        gui.title("Desea vender la mascota?");
        gui.menuOption(1,"Venderla");
        gui.menuOption(2,"Cancelar");
        int option = validate.validateNumber("Elija una opcion: ",1,2);
        
        switch (option) {
            case 1:
                pets = sellPet(pets, positionPet);
                break;
            case 2:
                System.out.println("\nAccion cancelada");
                break;
        }
        return pets;
    }
    
    public Pet[] sellPet(Pet[] pets, int positionPet){
        int level = pets[positionPet].getLevel();
        int petID = pets[positionPet].getPetID();
        
        pets[positionPet] = new NullPet();
        increaseGold(level);
        
        return pets;
    }
    
    public void increaseGold(int level){
        int gold = Store.getGold();
        
        switch (level) {
            case 1:
                gold++;
                break;
            case 2:
                gold = gold+2;
                break;
            case 3:
                gold = gold+3;
                break;
        }
        Store.setGold(gold);
    } 
}
