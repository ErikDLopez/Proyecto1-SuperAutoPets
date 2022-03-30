package com.animals.tier1;

import com.animals.Pet;

/**
 * Clase abstracta, hija de la clase Pet para las mascotas del tier 1
 *
 * @author Erik David Lopez
 * 
 */
public abstract class Tier1 extends Pet{

    /**
     * Metodo constructor que hereda de Pet, para crear una mascota del tipo tier 1
     * @param name nombre de la mascota
     * @param attackPoints puntos de ataque de la mascota
     * @param lifePoints puntos de vida de la mascota
     * @param petID identificado para cada una de las mascotas
     */
    public Tier1(String name, int attackPoints, int lifePoints, int petID) {
        super(name, attackPoints, lifePoints, petID);
    }
 
}
