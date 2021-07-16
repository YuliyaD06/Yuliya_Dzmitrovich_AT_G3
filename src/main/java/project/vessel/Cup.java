package main.java.project.vessel;

import main.java.project.stuff.Transformable;
import main.java.project.material.Material;
import main.java.project.vessel.Containable;
import main.java.project.vessel.Vessel;

public class Cup extends Vessel implements Containable {

    public Cup(double volume, double diameter, int weight, Material materialCup){
        super (volume, diameter, weight, materialCup);
        setDiameter(8.0);
        materialCup.getThermalConductivity();
        materialCup.getColor();
        materialCup.getDensity();
    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public void addStuff(Transformable stuff) {
        stuff = new Transformable() {
            @Override
            public void mix() {

            }
        };
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

}
