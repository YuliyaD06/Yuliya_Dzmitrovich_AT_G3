package main.java.project.actions;

import main.java.project.boxing.Bottle;
import main.java.project.material.Plastic;

public class Runner {
    public static void main(String[] args){

        Plastic plastic = new Plastic(0.1, "White", 0.85);

        Bottle theBottle = new Bottle(1.5, 10, 1700, plastic);
        theBottle.open();
        System.out.println();
        System.out.println();

        Bottle theBottle1 = new Bottle(1, 7, 1200, plastic);
        theBottle1.open();
        System.out.println();
        System.out.println();

        Bottle theBottle2 = new Bottle(0.5, 5, 700, plastic);
        theBottle2.open();

    }
}
