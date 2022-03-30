package com.animals;

/**
 * Clase padre de todas las mascotas del juego
 * @author Erik David Lopez
 * 
 */
public abstract class Pet {
    private String name;
    private int attackPoints;
    private int lifePoints;
    private int petID;

    /**
     * Metodo constructor para crear un objeto de la clase mascota
     * @param name nombre de la mascota
     * @param attackPoints puntos de ataque que puede hacer la mascota
     * @param lifePoints puntos de vida que posee la mascota
     * @param petID identificador para cada una de las mascotas
     */
    public Pet(String name, int attackPoints, int lifePoints, int petID) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.lifePoints = lifePoints;
        this.petID = petID;
    }

    /**
     * Setter para la variable que determina los puntos de ataque de la mascota
     * @param attackPoints
     */
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    /**
     * Setter para la variable que determina los puntos de vida de la mascota
     * @param lifePoints
     */
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    
    /**
     * Getter para la variable que determina el nombre de la mascota
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Getter para la variable que determina los puntos de ataque de la mascota
     * @return
     */
    public int getAttackPoints() {
        return attackPoints;
    }

    /**
     * Getter para la variable que determina los puntos de vida de la mascota
     * @return
     */
    public int getLifePoints() {
        return lifePoints;
    }

    /**
     * Getter para la variable que determina el identificador de la mascota
     * @return
     */
    public int getPetID() {
        return petID;
    }
    
    public void attack(){
        
    }
    
    public void loseAttackPoints(){
        
    }
    
    public void addAttack(int attackPoints){
        this.attackPoints += attackPoints;
    }
    
    public void addLife(int lifePoints){
        this.lifePoints += lifePoints;
    }
    
    public void loseLife(int lifePoints){
        this.lifePoints -= lifePoints;
        
        if (this.lifePoints <= 0) {
            this.lifePoints = 0;
        }
    }
    
    /**
     * Muestra los datos generales de la mascota, como lo es su nombre, vida y ataque
     */
    public void showStats(){    
        System.out.println("\n"+getName()+"    Ataque: "+getAttackPoints()+" pts "+"   Vida: "+getLifePoints()+" pts");
        //System.out.println("Ataque: "+getAttackPoints()+" pts "+"   Vida: "+getLifePoints()+" pts");
    }
    public void showData(){
        System.out.println("\n"+getName());
        System.out.println("Ataque: "+getAttackPoints()+" pts "+"   Vida: "+getLifePoints()+" pts");
    }

    public abstract void abilityLevel1();
    //public abstract void abilityLevel2();
    //public abstract void abilityLevel3();
    //public abstract void useAbility();
}
