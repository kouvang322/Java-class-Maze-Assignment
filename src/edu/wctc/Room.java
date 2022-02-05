package edu.wctc;

public abstract class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;


    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();


    public Room getAdjoiningRoom(char adjoinRoom) {

        // if this room is connected to another room of that char press, return that room
        if(isValidDirection(adjoinRoom) && adjoinRoom == 'n'){

          return north;
        }
        if(isValidDirection(adjoinRoom) && adjoinRoom == 's'){

          return south;
        }
        if(isValidDirection(adjoinRoom) && adjoinRoom == 'w'){

          return west;
        }
        if(isValidDirection(adjoinRoom) && adjoinRoom == 'e'){

          return east;
        }
        if(isValidDirection(adjoinRoom) && adjoinRoom == 'u'){

          return up;
        }
        if(isValidDirection(adjoinRoom) && adjoinRoom == 'd'){

          return down;
        }
        else {
            return null;
        }
    }

    public String getExits() {
        // return string of all directions the player can exit
        String exits = "";

        if(north != null ){
            exits += " north";
        }
        if(south != null ){
            exits += " south";
        }
        if(west != null ){
            exits += " west";
        }
        if(east != null ){
            exits += " east";
        }
        if(up != null ){
            exits += " up";
        }
        if(down != null ){
            exits += " down";
        }

        return exits;
    }


    public String getName() {
        return this.name;
    }

    public boolean isValidDirection(char valid) {


        // if room is connected to another room in the given direction return true
        //otherwise return false

        if(valid == 'n' && north != null) {
            return true;
        }
        else if(valid == 's' && south != null){
            return true;
        }else if(valid == 'w' && west != null){
            return true;
        }else if(valid == 'e' && east != null){
            return true;
        }else if(valid == 'u' && up != null){
            return true;
        }else if(valid == 'd' && down != null){
            return true;
        }
        else{
            return false;
        }
    }

    public void setNorth(Room nr) {
        this.north = nr;
    }

    public void setSouth(Room sr) {
        this.south = sr;
    }

    public void setEast(Room er) {
        this.east = er;
    }

    public void setWest(Room wr) {
        this.west = wr;
    }

    public void setUp(Room ur) {
        this.up = ur;
    }

    public void setDown(Room dr) {
        this.down = dr;
    }


}
