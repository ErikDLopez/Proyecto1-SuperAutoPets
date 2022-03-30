package com.functionality;

import com.animals.Pet;

/**
 * Clase donde se realizan las peleas entre dos mascotas
 *
 * @author Erik David Lopez
 * 
 */
public class Fight {
    
    public Pet attack(Pet attackingPet, Pet defensivePet){
        int damage = attackingPet.getAttackPoints();
        defensivePet.loseLife(damage);
        return defensivePet;
    }
    
    public boolean knockedOutPet(Pet pet){
        boolean petAlive = true;
        
        if (pet.getLifePoints() <= 0) {
            petAlive =  false;
        } else {
            petAlive =  true;
        }
        return petAlive;
    }
    
    public Pet receiveDamage(int petPos, int enemyPetPos,Pet[] pets, Pet[] enemyPets){
        System.out.println(pets[petPos].getName()+" (Ataque: "+pets[petPos].getAttackPoints()+") atacó a "+enemyPets[enemyPetPos].getName()+" (Vida: "+enemyPets[enemyPetPos].getLifePoints()+")");
        enemyPets[enemyPetPos] = attack(pets[petPos],enemyPets[enemyPetPos]);
        return enemyPets[enemyPetPos]; 
    }
    
    public void determineWinningPet(int petPos,int enemyPetPos,Pet[] pets, Pet[] enemyPets){
        System.out.println("\n"+pets[petPos].getName()+": "+pets[petPos].getLifePoints()+" pts de vida       "+enemyPets[enemyPetPos].getName()+": "+enemyPets[enemyPetPos].getLifePoints()+" pts de vida");
        
        if (pets[petPos].getLifePoints() <=0 && enemyPets[enemyPetPos].getLifePoints() <= 0) {
            System.out.println("Ambas mascotas fueron noqueadas");
        } else {
            if (pets[petPos].getLifePoints() <=0) {
                System.out.println(pets[petPos].getName()+" fue noqueado por "+enemyPets[enemyPetPos].getName());
            }
            if (enemyPets[enemyPetPos].getLifePoints() <= 0) {
                System.out.println(enemyPets[enemyPetPos].getName()+" fue noqueado por "+pets[petPos].getName());
            }
        }
    }
    
    public int nextPet(boolean petAlive, int petPosition){
        if (petAlive == false) {
            petPosition++;
        } else{
            
        }
        return petPosition;
    }
    public int reduceNumberOfPets(boolean petAlive, int numberOfPets){
        if (petAlive == false) {
            numberOfPets--;
        } else {
        
        }
        return numberOfPets;
    }
    
    public void determineWinningPlayer(int numberPets, int numberEnemyPets){
        if (numberPets == 0 && numberEnemyPets == 0) {
            System.out.println("\n --- EMPATE ---");
        } else {
            if (numberPets == 0) {
                System.out.println("\n --- HAS PERDIDO LA BATALLA ---");
            }
            if (numberEnemyPets == 0) {
                System.out.println("\n --- HAS GANADO LA PARTIDA ---");
            }
        }
    }
}
