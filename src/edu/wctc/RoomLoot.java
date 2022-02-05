package edu.wctc;

public class RoomLoot extends Room implements Lootable, Exitable{

    public RoomLoot(String name) {
        super(name);
    }

    @Override
    public String getDescription(){
        return "You are in a dark room. You can see a shiny chest.";
    }

    public String loot(Player player){
        player.addToInventory("Gold coins ");
        player.addToScore(100);
        return "You grabbed the gold coins in the chest";
    }


    public String exit(Player player){
        return "You exit the room";
    }

}
