package com.company;

public class Chair {

    private String colour;
    private int size;

    public Chair(String colour, int size) {
        this.colour = colour;
        this.size = size;
    }

    public void sit( int size, String colour){

        System.out.println("your sitting in a " + size + " size chair and it is " + colour + " colour ");
    }



    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }
}
