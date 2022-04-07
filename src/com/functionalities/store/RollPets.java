
package com.functionalities.store;

import com.animals.Pet;
import com.functionalities.actions.SelectPet;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;

/**
 *
 * @author erik-lopez
 */
public class RollPets {
    GUI gui = new GUI();
    Validation validate = new Validation();
    Store store = new Store();
    SelectPet selectPet = new SelectPet();
    
    public void roll(Pet[] petsStore, int gold, int round){
        if (gold > 0) {
            petsStore = generatePetsStore(petsStore, round);
            gold--;
            System.out.println("\nObteniendo nuevas mascotas");
            validate.enterToContinue();
        } else {
            System.out.println("\nNo tienes el oro suficiente");
            validate.enterToContinue();
        }
        Store.setGold(gold);
        Store.setPetsStore(petsStore);
        
    }
    public Pet[] generatePetsStore(Pet[] petsStore, int round){
        int numberOfPets = store.determineTierPets(round);
        
        for (int i = 0; i < petsStore.length; i++) {
            int petID = validate.randomNumber(1, numberOfPets);
            petsStore[i] = selectPet.definePet(petID);
        }
        return petsStore;
    }
}
