
package com.functionalities;

import com.functionalities.actions.SelectPet;
import com.animals.Pet;

/**
 * Clase donde se puede obtener un listado de todas las mascotas del juego
 *
 * @author Erik David Lopez
 */
public class PetList {
    
    Pet[] pets = new Pet[10];
    SelectPet selectPet = new SelectPet();
    
    /**
     * Muestra en pantalla un listado de todas las mascotas del juego
     */
    public void showPets(){
        for (int i = 0; i < pets.length; i++) {
            int petID = i+1;
            pets[i] = selectPet.definePet(petID);
            pets[i].showData();
        }
    }
    
    
}
