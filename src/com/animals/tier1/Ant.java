package com.animals.tier1;

/**
 * Clase hija de la clase abstract Tier1 (que es hija de Pet), para las mascotas que sean hormigas
 *
 * @author Erik David Lopez
 * 
 */
public class Ant extends Tier1 {

    /**
     * Metodo constructor heredado de Pet, con los valores por defecto de la mascota hormiga
     */
    public Ant() {
        super("HORMIGA",2,1,1);
    }

    @Override
    public void abilityLevel1() {
        
    }
    
}
