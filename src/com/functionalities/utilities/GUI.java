
package com.functionalities.utilities;

import com.functionalities.utilities.interfaces.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase destinada a los arreglos esteticos del juego, colores, tabulacion, titulos, etc
 * 
 * @author Erik David Lopez
 * 
 */
public class GUI implements Color{
    
    public void title(String message){
        System.out.println("\n "+GREEN+"--- "+message+" ---"+RESET);
    }
    
    public void menuOption(int numberOption, String message){
        System.out.println("   "+numberOption+". "+message); 
    }
    
    public void notification(String message){
        System.out.println("\n >>> "+message+" <<<");
    }
    
    public void clearConsole(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    public void sleepProcess(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public String generateSpacesNames(int lenght){
        String space = null;
        
        switch(lenght){
            case 11:
                space = "   ";
                break;
            case 10:
                space = "    ";
                break;
            case 9:
                space = "     ";
                break;
            case 8:
                space = "      ";
                break;
            case 7:
                space = "       ";
                break;
            case 6:
                space = "        ";
                break;
            case 5:
                space = "         ";
                break;
            case 4:
                space = "          ";
                break;
            case 3:
                space = "           ";
                break;
        }
        return space;
    }
    
    public String generateSpacesStats(int lenght){
        String space = null;
        
        switch(lenght){
            case 6:
                space = " ";
                break;
            case 5:
                space = "  ";
                break;
            case 4:
                space = "   ";
                break;
        }
        return space;
    }
    
}
