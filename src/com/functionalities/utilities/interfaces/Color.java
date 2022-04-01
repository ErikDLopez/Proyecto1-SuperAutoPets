
package com.functionalities.utilities.interfaces;

/**
 * Interfaz para la implementacion de colores, para el texto y para el fondo del texto
 *
 * @author Erik David Lopez
 * 
 */
public interface Color {
    /**
     * Variables dedicadas para el color del texto
     */
    final String GREEN = "\033[32m";
    final String YELLOW = "\033[33m";
    final String WHITE = "\033[37m";
    final String CYAN = "\033[36m";       
    final String RED = "\033[31m";
    final String PURPLE = "\033[35m";
    final String BLUE = "\u001B[34m";
    final String BLACK = "\033[30m";
    final String RESET = "\u001B[0m";
    
    /**
     * Variables dedicadas para el color del fondo del texto
     */
    final String BLUE_BACKGROUND = "\u001B[44m";
    final String PURPLE_BACKGROUND = "\u001B[45m";
    final String WHITE_BACKGROUND = "\u001B[47m";
    final String YELLOW_BACKGROUND = "\u001B[43m";
    final String GREEN_BACKGROUND = "\u001B[42m";
    final String BLACK_BACKGROUND = "\u001B[40m";
    final String RED_BLACKGROUND = "\u001B[41m";
    
}
