package main.java.project.boxing;
// Bottle:
//++ содеждит приватные поля double volume, SparklingWater water
//++ есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
//++ есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
//++ есть публичный метод SparklingWater getWater() возвращающий обьект воды
//++ есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды

import main.java.project.stuff.Bubble;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;
import main.java.project.type.Material;
import main.java.project.type.Plastic;


public class Bottle extends Vessel implements Containable{
    private double volume;
    private SparklingWater water = new SparklingWater();
    boolean opened;

    public Bottle(double volume, double diameter, int weight, Material materialBottle) {
        super (volume, diameter, weight, materialBottle);

        Plastic plasticBottle = (Plastic) materialBottle;
        plasticBottle.getThermalConductivity();
        plasticBottle.getColor();
        plasticBottle.getDensity();

        System.out.printf("The plastic bottle of "+ volume + " volume is created.").println();
        Bubble[] bubbles = new Bubble[(int)(10000*volume)];
        this.water.pump(bubbles);
        this.warm(3);

    }

    public void open(){
        this.water.setOpened(true);
        this.water.degas(water.getTemperature());
    }
    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }

    public void warm(int temperature){
        this.water.setTemperature(temperature);
        System.out.printf("Warming water to: %s", temperature).println();
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void close() {

    }
}