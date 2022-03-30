package com.animals.tier2;

/**
 * Clase hija de la clase abstract Tier2 (que es hija de Pet), para las mascotas que sean dodos
 * 
 * @author Erik David Lopez
 * 
 */
public class Dodo extends Tier2 {

    /**
     * Metodo constructor heredado de Pet, con los valores por defecto de la mascota dodo
     */
    public Dodo() {
        super("DODO",2,3,10);
    }

    @Override
    public void abilityLevel1() {
      
    }
    
}
