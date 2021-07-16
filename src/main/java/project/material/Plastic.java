package main.java.project.type;
//-- Plastic (thermalConductivity - 0.2, color - white, density - 1800)
public class Plastic extends Material {


    public Plastic(double thermalConductivity, String color, double density){

        super (thermalConductivity, color, density);
        this.setThermalConductivity(0.2);
        this.setColor("White");
        this.setDensity(1800);
        this.getColor();
        this.getDensity();
        this.getThermalConductivity();
    }

}
