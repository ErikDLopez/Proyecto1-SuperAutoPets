package com.animals.tier2;

/**
 * Clase hija de la clase abstract Tier2 (que es hija de Pet), para las mascotas que sean sapos
 * 
 * @author Erik David Lopez
 * 
 */
public class Frog extends Tier2 {

    /**
     * Metodo constructor heredado de Pet, con los valores por defecto de la mascota sapo
     */
    public Frog() {
        super("SAPO",3,3,9);
    }

    @Override
    public void abilityLevel1() {
       
    }
    
}
