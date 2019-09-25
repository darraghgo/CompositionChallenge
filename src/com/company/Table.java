package com.company;

public class Table {

    private int length;
    private int width;

    public Table(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void prepareTable(){

        System.out.println("the table is ready");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
