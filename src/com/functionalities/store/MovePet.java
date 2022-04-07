package com.functionalities.store;

import com.animals.NullPet;
import com.animals.Pet;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;

/**
 *
 * @author Erik David Lopez
 * 
 */
public class MovePet {
    GUI gui = new GUI();
    Validation validate = new Validation();
    
    public void move(Pet[] pets){
        gui.title("MOVER/FUSIONAR");
        gui.menuOption(1,"Intercambiar posiciones");
        gui.menuOption(2,"Fusionar mascotas del mismo tipo");
        pets = options(pets);
        Store.setPets(pets);
    }
    
    public Pet[] options(Pet[] pets){
        int option = validate.validateNumber("Seleccione una opcion: ",1,2);
        
        int positionPet1 = validate.validateNumber("No. de la primer mascota: ",1,5);
        int positionPet2 = validate.validateNumber("No. de la segunda mascota: ",1,5);
        positionPet1--;
        positionPet2--;
        
        int pet1 = pets[positionPet1].getPetID();
        int pet2 = pets[positionPet2].getPetID();
        
        if (pet1 == 0 && pet2 == 0) {
            System.out.println("\nEspaciones vacios, no se puede realizar la accion");
            validate.enterToContinue();
        } else {
            switch (option) {
                case 1:
                    pets = swapPets(pets, positionPet1,positionPet2);
                    break;
                case 2:
                    pets = mergePets(pets, positionPet1,positionPet2);
                    break;
            }
        }
        
        return pets;
    }
    
    public Pet[] swapPets(Pet[] pets, int positionPet1,int positionPet2){
        Pet pet1 = pets[positionPet1];
        Pet pet2 = pets[positionPet2];
        pets[positionPet1] = pet2;
        pets[positionPet2] = pet1;
        return pets;
    }
    
    public Pet[] mergePets(Pet[] pets, int positionPet1,int positionPet2){
        int pet1ID = pets[positionPet1].getPetID();
        int pet2ID = pets[positionPet2].getPetID();
        
        if (pet1ID == pet2ID) {
            pets = fuse(pets, positionPet1);
            pets[positionPet2] = new NullPet();
        } else {
            System.out.println("\nNo son mascotas del mismo tipo");
            validate.enterToContinue();
        }
        return pets;
    }
    
    public Pet[] fuse(Pet[] pets, int positionPet){
        int attack = pets[positionPet].getAttackPoints();
        int life = pets[positionPet].getLifePoints();
        attack++;
        life++;
        
        pets = levelUp(pets,positionPet);
        pets[positionPet].setAttackPoints(attack);
        pets[positionPet].setLifePoints(life);
        
        System.out.println("\nMascotas Fusionadas");
        validate.enterToContinue();
        return pets;
    }
    
    public Pet[] levelUp(Pet[] pets,int positionPet){
        int levelProgress = pets[positionPet].getLevelProgress();
        levelProgress++;
        pets[positionPet].setLevelProgress(levelProgress);
        pets[positionPet].levelUp(levelProgress);
        return pets;
    }
}
