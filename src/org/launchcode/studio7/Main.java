package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("Christmas Carols for Atheists", 700.23, "600 MB");
        DVD dvd = new DVD("Fight Club", 4.8, "1530");

        cd.spinDisc();
        cd.readData();
        dvd.spinDisc();
        dvd.readData();
    }
}
