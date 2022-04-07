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
import com.animals.tier2.Elephant;
import com.animals.tier2.Fox;
import com.animals.tier2.Frog;
import com.animals.tier2.Peacock;
import com.animals.tier2.Porcupine;
import com.animals.tier2.Rat;
import com.animals.tier2.Spider;
import com.animals.tier3.Camel;
import com.animals.tier3.Giraffe;
import com.animals.tier3.Kangaroo;
import com.animals.tier3.Owl;
import com.animals.tier3.Ox;
import com.animals.tier3.Rabbit;
import com.animals.tier3.Raccoon;
import com.animals.tier3.Sheep;
import com.animals.tier3.Snail;
import com.animals.tier3.Turtle;
import com.animals.tier3.Wolf;
import com.animals.tier4.Cougar;
import com.animals.tier4.Deer;
import com.animals.tier4.Dolphin;
import com.animals.tier4.Hippo;
import com.animals.tier4.Llama;
import com.animals.tier4.Parrot;
import com.animals.tier4.Squirrel;
import com.animals.tier4.Whale;
import com.animals.tier5.Cocodrile;
import com.animals.tier5.Cow;
import com.animals.tier5.Jaguar;
import com.animals.tier5.Monkey;
import com.animals.tier5.Rhino;
import com.animals.tier5.Scorpion;
import com.animals.tier5.Seal;
import com.animals.tier5.Turkey;
import com.animals.tier6.Cat;
import com.animals.tier6.Fly;
import com.animals.tier6.Gorilla;
import com.animals.tier6.Leopard;
import com.animals.tier6.Mamut;
import com.animals.tier6.Octopus;
import com.animals.tier6.Panda;
import com.animals.tier6.Snake;
import com.animals.tier6.Tiger;
import com.animals.tier7.Chameleon;
import com.animals.tier7.Quetzal;

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
            case 11:
                pet = new Elephant();
                break;
            case 12:
                pet = new Porcupine();
                break;
            case 13:
                pet = new Peacock();
                break;
            case 14:
                pet = new Rat();
                break;
            case 15:
                pet = new Fox();
                break;
            case 16:
                pet = new Spider();
                break;
            case 17:
                pet = new Camel();
                break;
            case 18:
                pet = new Raccoon();
                break;
            case 19:
                pet = new Giraffe();
                break;
            case 20:
                pet = new Turtle();
                break;
            case 21:
                pet = new Snail();
                break;
            case 22:
                pet = new Sheep();
                break;
            case 23:
                pet = new Rabbit();
                break;
            case 24:
                pet = new Wolf();
                break;
            case 25:
                pet = new Ox();
                break;
            case 26:
                pet = new Kangaroo();
                break;
            case 27:
                pet = new Owl();
                break;
            case 28:
                pet = new Deer();
                break;    
            case 29:
                pet = new Parrot();
                break;
            case 30:
                pet = new Hippo();
                break;
            case 31:
                pet = new Dolphin();
                break;
            case 32:
                pet = new Cougar();
                break;
            case 33:
                pet = new Whale();
                break;
            case 34:
                pet = new Squirrel();
                break;
            case 35:
                pet = new Llama();
                break;
            case 36:
                pet = new Seal();
                break;
            case 37:
                pet = new Jaguar();
                break;
            case 38:
                pet = new Scorpion();
                break;
            case 39:
                pet = new Rhino();
                break;
            case 40:
                pet = new Monkey();
                break;
            case 41:
                pet = new Cocodrile();
                break;
            case 42:
                pet = new Cow();
                break;
            case 43:
                pet = new Turkey();
                break;
            case 44:
                pet = new Panda();
                break;
            case 45:
                pet = new Cat();
                break; 
            case 46:
                pet = new Tiger();
                break;
            case 47:
                pet = new Snake();
                break;
            case 48:
                pet = new Mamut();
                break;
            case 49:
                pet = new Leopard();
                break;
            case 50:
                pet = new Gorilla();
                break; 
            case 51:
                pet = new Octopus();
                break;
            case 52:
                pet = new Fly();
                break;
            case 53:
                pet = new Quetzal();
                break;
            case 54:
                pet = new Chameleon();
                break;
        }
        return pet;
    }
}
