package com.company;

public class Windows {

    private int number;
    private boolean clearGlass;



    public Windows(int number, boolean clearGlass) {
        this.number = number;
        this.clearGlass = clearGlass;
    }

    public void openWindow(){

        System.out.println("The window is open ");
    }

    public int getNumber() {
        return number;
    }

    public boolean isClearGlass() {
        return clearGlass;
    }
}
