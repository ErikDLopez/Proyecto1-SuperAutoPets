package com.principal;

import com.functionality.PetList;
import com.functionality.arena.ArenaMode;
import com.utilities.GUI;
import com.utilities.Validation;

/**
 * Clase que contiene el menu principal y sus diferentes opciones para el juego
 * 
 * @author Erik David Lopez
 * 
 */
public class Menu {
    Validation validate = new Validation();
    GUI gui = new GUI();
    
    public void showMenu(){
        int opcion;
        boolean repeat = true;
        
        while (repeat) {            
            gui.title("SUPER AUTO PETS");
            gui.menuOption(1,"Modo Arena");
            gui.menuOption(2,"Modo Versus");
            gui.menuOption(3,"Modo Creativo");
            gui.menuOption(4,"Listado de Mascotas");
            gui.menuOption(5,"Salir");
            opcion = validate.validateNumber("Seleccione una opcion: ",1,5);
            repeat = menuOption(opcion);
        } 
    }
    
    public boolean menuOption(int opcion){
        boolean repeat = true;
        
        switch(opcion){
            case 1:
                arenaMode();
                
                break;
            case 2:
                versusMode();
                validate.enterToContinue();
                gui.clearConsole();
                
                break;
            case 3:
                creativeMode();
                validate.enterToContinue();
               gui.clearConsole();
                break;
            case 4:
                showPets();
                validate.enterToContinue();
                gui.clearConsole();
                break;
            case 5:
                gui.notification("CERRANDO LA APLICACION");
                repeat = false;
                break;
        }
        return repeat;
    }
    
    public void arenaMode(){
        gui.title("MODO ARENA");
        ArenaMode arenaMode = new ArenaMode();
        arenaMode.startBattle();
        validate.enterToContinue();
    }
    public void versusMode(){
        gui.title("MODO VERSUS");
    }
    public void creativeMode(){
        gui.title("MODO CREATIVO");
    }
    public void showPets(){
        gui.title("LISTADO DE MASCOTAS");
        PetList petList = new PetList();
        petList.showPets();
        validate.enterToContinue();
    }
}
