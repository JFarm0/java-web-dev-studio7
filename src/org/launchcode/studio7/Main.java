package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD cd1 = new CD("Lateralus", "CD", 80, 79);
        DVD dvd = new DVD("Fight Club", "DVD", 80, 50);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(cd1.getName());

        System.out.println("-----");
        cd1.discInfo();
        System.out.println("-----");
        cd1.spinDisc();
        System.out.println("-----");
        cd1.readData();
        System.out.println("-----");
        cd1.rockOut();
        System.out.println("-----");

        System.out.println(dvd.getName());

        System.out.println("-----");
        dvd.discInfo();
        System.out.println("-----");
        dvd.spinDisc();
        System.out.println("-----");
        dvd.readData();
        System.out.println("-----");
        dvd.menuPresent();
        System.out.println("-----");


    }
}
