package com.functionalities.actions;

import com.animals.NullPet;
import com.animals.Pet;
import com.animals.tier1.Ant;
import com.animals.tier1.Beaver;
import com.animals.tier1.Beetle;
import com.animals.tier1.Cricket;
import com.animals.tier1.Fish;
import com.animals.tier1.Horse;
import com.animals.tier1.Mosquito;
import com.animals.tier1.Otter;
import com.animals.tier2.Dodo;
import com.animals.tier2.Frog;

/**
 *
 * @author Erik David Lopez
 */
public class SelectPet {
    
    /**
     * Determina el tipo de mascota en base a un identificador que recibe
     * @param petID identificador para cada mascota del juego
     * @return un objeto de tipo Pet del tipo de mascota seleccionado 
     */
    public Pet definePet(int petID){
        Pet pet = null;
        
        switch(petID){
            case 0:
                pet = new NullPet();
                break;
            case 1:
                pet = new Ant();
                break;
            case 2:
                pet = new Fish();
                break;
            case 3:
                pet = new Mosquito();
                break;
            case 4:
                pet = new Cricket();
                break;
            case 5:
                pet = new Beaver();
                break;
            case 6:
                pet = new Horse();
                break;
            case 7:
                pet = new Otter();
                break;
            case 8:
                pet = new Beetle();
                break;
            case 9:
                pet = new Frog();
                break;
            case 10:
                pet = new Dodo();
                break;
        }
        return pet;
    }
}
