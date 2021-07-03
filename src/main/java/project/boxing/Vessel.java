package main.java.project.boxing;
// - each Vessel has:
// -- private double volume;
// -- private double diameter;
// -- private int weight;
// -- private Material material;
// -- all field are set in costructor

import main.java.project.type.Material;

public abstract class Vessel {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public Vessel(double volume, double diameter, int weight, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = weight;
        this.material = material;
        this.material.getThermalConductivity();
        this.material.getColor();
        this.material.getDensity();
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        this.material.getThermalConductivity();
        this.material.getColor();
        this.material.getDensity();
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
