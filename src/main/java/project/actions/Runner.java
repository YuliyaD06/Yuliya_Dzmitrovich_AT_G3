package main.java.project.actions;

import main.java.project.boxing.Bottle;
import main.java.project.boxing.Warehouse;
import main.java.project.type.Plastic;

public class Runner {
    public static void main(String[] args){

        Plastic plasticBottle = new Plastic(0.1, "White", 0.85);
        Bottle theBottle1 = new Bottle(0.5, 2.0, 600, plasticBottle);
        theBottle1.open();

        Warehouse warehouse = new Warehouse();
        warehouse.getBottleBox();
        warehouse.toString();



    }
}
