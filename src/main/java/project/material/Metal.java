package main.java.project.material;
//-- Metal (thermalConductivity - 58.0, color - silver, density - 7800)
public class Metal extends Material {

    public Metal(double thermalConductivity, String color, double density){
        super (thermalConductivity, color, density);
        this.setColor("Silver");
        this.setDensity(7800);
        this.setThermalConductivity(58.0);
        this.getThermalConductivity();
        this.getColor();
        this.getDensity();
    }

}
