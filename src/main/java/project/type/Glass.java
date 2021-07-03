package main.java.project.type;

public class Glass extends Material {

    public Glass(double thermalConductivity, String color, double density){
        super (thermalConductivity, color, density);
        this.setColor("White");
        this.setDensity(0.6);
        this.setThermalConductivity(1);
        this.getThermalConductivity();
        this.getColor();
        this.getDensity();
    }

}
