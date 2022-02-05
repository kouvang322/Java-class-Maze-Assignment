package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player{
    private int score = 0;
    private List<String> inventory;


    public Player(){
        inventory = new ArrayList<>();
    }

    public void addToInventory(String inventoryAdd) {
        inventory.add(inventoryAdd);
    }

    public void addToScore(int scoreAdd) {
        score += scoreAdd;
    }

    public String getInventory(){
        return ("Current inventory: " + inventory);
    }

    public int getScore(){
        return score;
    }

}
