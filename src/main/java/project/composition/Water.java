package main.java.project.composition;
//---- Water:
//++содеждит приватные поля String color = "no", String transparency = "transparent", String smell = "no", int temperature = 0
//++содеждит геттеры и сеттеры ко всем полям
public abstract class Water {
    
    private String color = "no";
    private String transparency = "transperent";
    private String smell = "no";
    public int temperature = 0;

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

    public abstract void cramp(Bubble[] bubbles);
}
