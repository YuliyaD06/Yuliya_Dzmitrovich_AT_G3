package main.java.project.vessel;
//---- private double volume;
//---- private double diameter;
//---- private int weight;
//---- private Material material;
//---- volume, diameter, material are passed from
//  ?????? child constructor
//---- weight is set in constructor as density * volume / 4
//---- all fields have getters and setters

import main.java.project.material.Material;

public abstract class Vessel {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public Vessel() {
        //in constructor?
        
        //this.volume = volume;
        //this.diameter = diameter;
        //this.weight = weight;
        //this.material = material;

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
