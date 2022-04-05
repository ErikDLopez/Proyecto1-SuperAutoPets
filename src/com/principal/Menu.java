package com.principal;

import com.functionalities.PetList;
import com.functionalities.combats.ArenaMode;
import com.functionalities.utilities.GUI;
import com.functionalities.utilities.Validation;

/**
 * Clase que contiene el menu principal y sus diferentes opciones para el juego
 * 
 * @author Erik David Lopez
 * 
 */
public class Menu {
    Validation validate = new Validation();
    GUI gui = new GUI();
    
    /**
     * Muestra el menu principal del juego con las opciones disponibles
     */
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
    
    /**
     * Metodo que manda a llamar a las diferentes acciones que el menu permite realizar
     * @param opcion es el numero de la opcion que se seleccione
     * @return un valor booleano para determinar si se sigue repitiendo el menu o se finaliza el programa
     */
    public boolean menuOption(int opcion){
        boolean repeat = true;
        
        switch(opcion){
            case 1:
                gui.clearConsole();
                arenaMode();
                
                break;
            case 2:
                versusMode();
                gui.clearConsole();
                
                break;
            case 3:
                creativeMode();
                gui.clearConsole();
                break;
            case 4:
                showPets();
                gui.clearConsole();
                break;
            case 5:
                gui.notification("CERRANDO LA APLICACION");
                repeat = false;
                break;
        }
        return repeat;
    }
    
    /**
     * Se inicializan los objetos y metodos necesarios para el modo arena
     */
    public void arenaMode(){
        gui.title("MODO ARENA");
        ArenaMode arenaMode = new ArenaMode();
        arenaMode.startGame();
    }

    /**
     * Se inicializan los objetos y metodos necesarios para el modo versus
     */
    public void versusMode(){
        gui.title("MODO VERSUS");
    }

    /**
     * Se inicializan los objetos y metodos necesarios para el modo creativo
     */
    public void creativeMode(){
        gui.title("MODO CREATIVO");
    }

    /**
     * Se inicializan los objetos y metodos necesarios para el listado de mascotas
     */
    public void showPets(){
        gui.title("LISTADO DE MASCOTAS");
        PetList petList = new PetList();
        petList.showPets();
        validate.enterToContinue();
    }
}
