package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze();
        Scanner keyboard = new Scanner(System.in);


        while(!maze.isFinished()){
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println("What would you like to do?");

            // print out current room's exits
            System.out.println("Exits to this room are: " + maze.getCurrentRoomExits());

            char userInput = keyboard.next().charAt(0);

            if (userInput == 'n'){
                maze.move('n');
            }
            if (userInput == 's'){
                maze.move('s');
            }
            if (userInput == 'w'){
                maze.move('w');
            }
            if (userInput == 'e'){
                maze.move('e');
            }
            if (userInput == 'u'){
                maze.move('u');
            }
            if (userInput == 'd'){
                maze.move('d');
            }

            if(userInput == 'i'){
                System.out.println(maze.interactWithCurrentRoom());
            }
            if(userInput == 'l'){
                System.out.println(maze.lootCurrentRoom());
            }
            if(userInput == 'v') {
                System.out.println(maze.getPlayerInventory());
            }

            if(userInput == 'x'){
                maze.setFinished(true);
                System.out.println(maze.exitCurrentRoom());
                System.out.println("Congratulations!!! You have exited the maze.");
                System.out.println("Player Score: " + maze.getPlayerScore());
            }
        }
    }
}
