package edu.wctc;

import java.util.List;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze() {
        player = new Player();
        RoomInteract roomInteract = new RoomInteract("interactRoom");
        RoomLoot roomLootUpstairs = new RoomLoot("upstairsLoot");
        RoomLoot roomLoot = new RoomLoot("lootRoom");
        RoomExits roomMiddle = new RoomExits("fillerRoom");
        RoomExits roomEntrance = new RoomExits("caveEntrance");

        currentRoom = roomEntrance;

        roomLootUpstairs.setDown(roomEntrance);
        roomEntrance.setUp(roomLootUpstairs);

        roomMiddle.setSouth(roomEntrance);
        roomEntrance.setNorth(roomMiddle);

        roomInteract.setSouth(roomMiddle);
        roomMiddle.setNorth(roomInteract);

        roomInteract.setEast(roomLoot);
        roomLoot.setWest(roomInteract);

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public String exitCurrentRoom() {
        // if current room is exitable return results of exit()

        if (currentRoom instanceof Exitable) {

            return ((Exitable) currentRoom).exit(player);
        } else {
            return "There are no exits in this room.";
        }
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }

    public int getPlayerScore() {
        return player.getScore();
    }


    public String interactWithCurrentRoom() {

        if (currentRoom instanceof Interactable) {

            return ((Interactable) currentRoom).interact(player);
        } else {
            return "There is nothing to interact with in this room.";
        }
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }


    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable ) {
            return ((Lootable) currentRoom).loot(player);
        } else {
            return "There is nothing to loot in this room.";
        }
    }


    public boolean move(char move) {
        if (currentRoom.isValidDirection(move)) {
            currentRoom = currentRoom.getAdjoiningRoom(move);
            return true;
        } else {
            return false;
        }
    }

}
