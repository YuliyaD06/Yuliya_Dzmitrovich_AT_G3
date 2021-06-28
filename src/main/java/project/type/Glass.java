package main.java.project.type;

public class Glass extends Material {
    //(double thermalConductivity, String color, double density)
    public Glass(double thermalConductivity, String color, double density){
        super (thermalConductivity, color, density);
        this.getThermalConductivity();
        this.getColor();
        this.getDensity();
    }

}
