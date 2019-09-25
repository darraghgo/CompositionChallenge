package com.company;

public class Room {

    private Chair chair;
    private Windows windows;
    private Table table;

    public Room(Chair chair, Windows windows, Table table) {
        this.chair = chair;
        this.windows = windows;
        this.table = table;
    }

    public void warmDay(){

        windows.openWindow();
    }

    public void endDay(){

        warmDay();
        table.prepareTable();
        readyChair();
    }

    private void readyChair (){

        chair.sit(23,"Red");

    }

    public Windows getWindows(){
        return this.windows;
    }
}
