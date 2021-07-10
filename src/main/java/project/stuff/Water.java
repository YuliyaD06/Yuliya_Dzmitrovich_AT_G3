package main.java.project.stuff;
/*Water:
++содеждит приватные поля String color = "no", String transparency = "transparent", String smell = "no", int temperature = 0
++содеждит геттеры и сеттеры ко всем полям*/

public abstract class Water implements Transformable{
    
    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public Water() {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String isSmell() {
        return smell;
    }
    public void setSmell(String smell) {
        this.smell = smell;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public String getTransparency() {
        return transparency;
    }
    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    @Override
    public void mix() {

    }
}
