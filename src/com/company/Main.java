package com.company;

public class Main {

    public static void main(String[] args) {


        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.


        Chair chair = new Chair("Green",34);
        Windows windows = new Windows(56,true);
        Table table = new Table(400,600);


        Room room = new Room(chair,windows,table);

        room.warmDay();
        room.endDay();

        room.getWindows().openWindow(); //another way of calling openWindow()

    }
}
