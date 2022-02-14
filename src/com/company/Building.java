package com.company;

public class Building {

    int windows;
    int doors;


    public Building(int windows, int doors) {
        this.windows = windows;
        this.doors = doors;
    }

    public void printWindows(){
        System.out.println(windows);
    }

}
