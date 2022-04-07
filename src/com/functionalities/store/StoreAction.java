
package com.functionalities.store;

import com.animals.NullPet;
import com.animals.Pet;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;

/**
 * Clase en la cual se establecen los metodos necesarios para la compra, movimiento y venta de mascotas en la tienda del juego
 * 
 * @author Erik David Lopez
 */
public class StoreAction{
    Validation validate = new Validation();
    GUI gui = new GUI();
    
    public void showStore(int round, int lifes, int cups){
        Store.setGold(10);
        boolean openStore = true;
        
        while (openStore) {            
            gui.title("TIENDA");
            System.out.println("\nVidas: "+lifes);
            System.out.println("Ronda: "+round);
            System.out.println("Copas: "+cups);
            System.out.println("Oro:   "+Store.getGold());
            showPets(Store.getPets());
            
            System.out.println("\nTienda de Mascotas:");
            showPetsAvailable(Store.getPetsStore());
            openStore = storeMenu();
            gui.clearConsole();
        }
        
    }
    public boolean storeMenu(){
        int option;
        
        gui.title("ACCIONES");
        gui.menuOption(1,"Comprar");
        gui.menuOption(2,"Vender Mascota");
        gui.menuOption(3,"Mezclar");
        gui.menuOption(4,"Mover/Fusionar Mascotas");
        gui.menuOption(5,"Terminar Turno");
        option = validate.validateNumber("Seleccione una opcion: ",1,5);
        boolean repeat = storeMenuOptions(option);
        
        return repeat;
    }
    
    public boolean storeMenuOptions(int option){
        boolean repeat = true;
        
        switch(option){
            case 1:
                buy();
                break;
            case 2:
                sellPet();
                break;
            case 3:
                rollPets();
                break;
            case 4:
                move();
                break;
            case 5:
                System.out.println("Buscando combate");
                validate.enterToContinue();
                repeat = false;
                break;
        }
        return repeat;
    }
    
    public void buy(){
        BuyAtStore buyAtStore = new BuyAtStore();
        buyAtStore.buy(Store.getPets(),Store.getPetsStore(),Store.getGold());
    }
    
    public void sellPet(){
        SellPet sellPet = new SellPet();
        sellPet.sell(Store.getPets());
    }
    
    public void rollPets(){
        RollPets rollPets = new RollPets();
        rollPets.roll(Store.getPetsStore(),Store.getGold(),Store.getRound());
    }
    
    public void move(){
        MovePet movePet = new MovePet();
        movePet.move(Store.getPets());
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
    
    public void showPetsAvailable(Pet[] petsStore){
        int position = 1;
        
        for (int i = 0; i < petsStore.length; i++) {
            System.out.print(position+".  ");
            petsStore[i].showStats();
            position++;
        }
    }
    
    
}
