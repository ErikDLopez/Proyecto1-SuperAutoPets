package com.functionalities.utilities;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase en la cual se tienen las validaciones necesarias para los diferentes tipos de datos en java
 *
 * @author Erik David Lopez
 * 
 */
public class Validation {
    Scanner scan = new Scanner(System.in);
    
    public String validateString(String message) {
        String string = "";
        boolean repeat = false;

        do {
            System.out.print(message);
            string = scan.nextLine();
            string = string.trim();
            
            if (string.length() > 0) {
                repeat = false;
            } else {
                System.out.println("\nINGRESE AL MENOS UN CARACTER");
                repeat = true;
            }
        } while (repeat);
        return string;
    }
    public int validateNumber(String message,int lowerBound, int upperBound){
        int number = 0;
        boolean repeat = false;
        
        do {            
            try {
                System.out.print(message);
                number = scan.nextInt();
                
                if (number >= lowerBound && number <= upperBound) {
                    repeat = false;
                } else {
                    System.out.println("\nIngrese Una Opcion Valida Entre "+lowerBound+" y "+upperBound);
                    repeat = true;
                }
            } catch (Exception e) {
                System.out.println("\nIngrese Una Opcion Valida Entre "+lowerBound+" y "+upperBound);
                repeat = true;
            }
            scan.nextLine();
        } while (repeat);
        return number;
    }
    
    public void enterToContinue(){
        String continueTurn;
        System.out.println("\nPresione Enter para continuar");
        try {
            continueTurn = scan.nextLine();
        } catch (Exception e) {
        }     
    }
    
    public int randomNumber(int lowerBound, int upperBound){
        Random random = new Random();
        int number = random.nextInt(upperBound)+lowerBound;
        return number;
    }
}
