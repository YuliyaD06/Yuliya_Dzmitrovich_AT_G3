package main.java.tasks.day1;

public abstract class Vessel {

    public int volume;
    public int height;
    public String material;
    public String color;

    public Vessel() {
        this.volume = 200;
        this.height = 10;
    }
    public Vessel(int volume, int height) {
        this.volume = volume;
        this.height = height;
    }
    public Vessel(int height) {
        this.volume = 100;
        this.height = height;
        this.material = "plastic";
        this.color = "white";
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
