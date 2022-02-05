package edu.wctc;

public class RoomInteract extends Room implements Interactable, Exitable{

    public RoomInteract(String name) {
        super(name);
    }

    public String getDescription(){
        return "You are in  a room filled with torches. You can see a table with books.";
    }

    public String interact(Player player){
        player.addToScore(50);
        return "You read a book. Learned location of the chests.";
    }

    public String exit(Player player){
        return "You exit the room";
    }
}
