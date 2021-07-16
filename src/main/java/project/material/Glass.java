package main.java.project.type;
//-- Glass (thermalConductivity - 0.017, color - green, density - 2200)
public class Glass extends Material {

    public Glass(double thermalConductivity, String color, double density){
        super (thermalConductivity, color, density);
        this.setColor("Green");
        this.setDensity(0.017);
        this.setThermalConductivity(2200);
        this.getThermalConductivity();
        this.getColor();
        this.getDensity();
    }

}
