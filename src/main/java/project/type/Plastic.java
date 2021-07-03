package main.java.project.type;

public class Plastic extends Material {


    public Plastic(double thermalConductivity, String color, double density){

        super (thermalConductivity, color, density);
        this.setThermalConductivity(0.1);
        this.setColor("Purple");
        this.setDensity(0.85);
        this.getColor();
        this.getDensity();
        this.getThermalConductivity();
    }

}
