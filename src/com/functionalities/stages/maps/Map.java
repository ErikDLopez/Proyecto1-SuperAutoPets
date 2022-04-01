
package com.functionalities.stages.maps;

import com.animals.Pet;
import com.functionalities.utilities.GUI;

/**
 * Clase con la cual se genera los diferentes fondos para el juego, como el mapa, eleccion de mascotas, etc
 * 
 * @author Erik David Lopez
 */
public class Map {
    String[][] map =  new String[12][7];
    GUI gui = new GUI();
    
    public void generateMap(Pet[] pets,Pet[] enemyPets,int petPos,int enemyPetPos){
        defaultMap();
        savePetOnMap(1,2, pets);
        savePetOnMap(2,4, enemyPets);
        correctSpaces(2,"--------------");
        correctSpaces(4,"   --------------");
        fightingPets(1, pets[petPos],1,2);
        fightingPets(2, enemyPets[enemyPetPos],5,4);
        printMap();
    }
    
    public void printMap(){
        for (int x = 0; x < map.length; x++) {
            System.out.print("  ");
            
            for (int y = 0; y < map[x].length; y++) {
                System.out.print(map[x][y]);
                
                if (y!=map[x].length-1){ 
                    System.out.print(" ");
                }
            }
            System.out.println();//este es el salto de linea
        }
    }
    public void defaultMap(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = "-------";
            }
        }
    }
    public void savePetOnMap(int petID,int column,Pet[] pets){
        int numberPet = 4;
        String name,space = null;
        int lenght = 0;
        
        for (int i = 2; i < 7; i++) {
            name = pets[numberPet].getName();
            lenght = name.length();
            space = gui.generateSpacesNames(lenght);
            switch(petID){
                case 1:
                    map[i][column] = name+space;
                    break;
                case 2:
                    map[i][column] = "   "+name+space;
                    break;
            }
            numberPet--;
        }
    }
    
    public void fightingPets(int petID, Pet pet,int pos1,int pos2){
        String name = pet.getName();
        String attack = String.valueOf(pet.getAttackPoints());
        String life = String.valueOf(pet.getLifePoints());
        
        int lenghtName =  name.length();
        String spaceName =  gui.generateSpacesNames(lenghtName);
        String data = "("+attack+"/"+life+")";
        int lenghtData = data.length();
        String spaceData = gui.generateSpacesStats(lenghtData);
        
        switch(petID){
                case 1:
                    map[9][pos2] = name+spaceName;
                    break;
                case 2:
                    map[9][pos2] = "   "+name+spaceName;
                    break;
            }
        map[9][pos1] = data+spaceData;
        map[9][3] = "  VS.  ";
    }
    
    public void correctSpaces(int column,String definedSpaced){
        map[0][column] = definedSpaced;
        map[1][column] = definedSpaced;
        map[7][column] = definedSpaced;
        map[8][column] = definedSpaced;
        map[10][column] = definedSpaced;
        map[11][column] = definedSpaced;
    }
    
}
