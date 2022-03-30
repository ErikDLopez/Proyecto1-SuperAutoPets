package com.animals.tier1;

/**
 * Clase hija de la clase abstract Tier1 (que es hija de Pet), para las mascotas que sean peces
 * 
 * @author Erik David Lopez
 * 
 */
public class Fish extends Tier1 {

    /**
     * Metodo constructor heredado de Pet, con los valores por defecto de la mascota pez
     */
    public Fish() {
        super("PEZ",2,3,2);
    }

    @Override
    public void abilityLevel1() {
        
    }
    
}
