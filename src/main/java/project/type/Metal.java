package main.java.project.type;

public class Metal extends Material {

    public Metal(double thermalConductivity, String color, double density){
        super (thermalConductivity, color, density);
        this.setColor("Red");
        this.setDensity(7.85);
        this.setThermalConductivity(74.4);
        this.getThermalConductivity();
        this.getColor();
        this.getDensity();
    }

}
