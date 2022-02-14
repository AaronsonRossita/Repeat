package com.company;

public class Main {

    public static void main(String[] args) {
//  יצירת משתנה פרימיטיבי
//  datatype name
        int   x   ;
        x = 8;

//      אובייקט מקלאס
//      datatype   name     constructor בנאי
        Building building1 = new Building(7,2);
        Building building2 = new Building(x,2);

        building1.printWindows();
        building2.printWindows();

        something(building1);
        something(building2);
    }

    public static void something(Building b){
        System.out.println(b.windows * 2);
    }
}
