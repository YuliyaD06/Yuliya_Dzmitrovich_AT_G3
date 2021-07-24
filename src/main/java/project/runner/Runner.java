package main.java.project.runner;

import main.java.project.vessel.Bottle;
import main.java.project.material.Plastic;

public class Runner {
    public static void main(String[] args){

        Bottle theBottle = new Bottle(1.0, new Plastic());
        theBottle.open();


    }
}
