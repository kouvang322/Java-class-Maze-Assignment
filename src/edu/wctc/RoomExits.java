package edu.wctc;

public class RoomExits extends Room implements Exitable {

    public RoomExits(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in a dark and empty room.";
    }

    public String exit(Player player) {
       return "You exit the room";
    }
}
