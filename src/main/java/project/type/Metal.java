package main.java.project.type;

public class Metal extends Material {

    public Metal(double thermalConductivity, String color, double density){
        super (thermalConductivity, color, density);
        this.getThermalConductivity();
        this.getColor();
        this.getDensity();
    }

}
