package main.java.project.boxing;

import main.java.project.stuff.Transformable;
import main.java.project.type.Material;

public class Can extends Vessel implements Containable{

    public Can(double volume, double diameter, int weight, Material materialCan){
        super (volume, diameter, weight, materialCan);
        materialCan.getThermalConductivity();
        materialCan.getColor();
        materialCan.getDensity();
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
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
