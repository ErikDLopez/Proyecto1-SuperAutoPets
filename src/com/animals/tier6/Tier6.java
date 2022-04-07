package com.animals.tier6;

import com.animals.Pet;

/**
 * Clase abstracta, hija de la clase Pet para las mascotas del tier 6
 * 
 * @author erik-lopez
 * 
 */
public abstract class Tier6 extends Pet {

    /**
     * Metodo constructor que hereda de Pet, para crear una mascota del tipo tier 6
     * @param name nombre de la mascota
     * @param attackPoints puntos de ataque de la mascota
     * @param lifePoints puntos de vida de la mascota
     * @param petID identificador para cada una de las mascotas
     */
    public Tier6(String name, int attackPoints, int lifePoints, int petID) {
        super(name, attackPoints, lifePoints, petID);
    }
    
}
