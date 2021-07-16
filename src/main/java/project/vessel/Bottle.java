package main.java.project.vessel;
// Bottle:
//++ содеждит приватные поля double volume, SparklingWater water
//++ есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
//++ есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
//++ есть публичный метод SparklingWater getWater() возвращающий обьект воды
//++ есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды

import main.java.project.stuff.Bubble;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;
import main.java.project.material.Material;
import main.java.project.material.Plastic;


import java.util.Arrays;
import java.util.List;

//---- diameter - default for Bottle - 2.0, Cup - 8.0, Can - 10.0
//---- volume - is passed from child constructor
//---- material - is passed from child constructor

public class Bottle extends Vessel implements Containable {

    private double volume;
    private SparklingWater water = new SparklingWater();
    boolean opened;

    public Bottle(double volume, double diameter, int weight, Material materialBottle) {
        super (volume, diameter, weight, materialBottle);
        setDiameter(2.0);
        Plastic plasticBottle = (Plastic) materialBottle;
        plasticBottle.getThermalConductivity();
        plasticBottle.getColor();
        plasticBottle.getDensity();

        System.out.printf("The plastic bottle of "+ volume + " volume is created.").println();

        Bubble[] bubbles = new Bubble[(int)(10000 * volume)];

        List<Bubble> bubblesList = Arrays.asList(bubbles);
        //bubblesList.size();

        this.water.pump(bubblesList);
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

/*            -- void addStuff (Transformable stuff) - adds some stuff (e.g. water, sand) to Containable object
         -- Transformable removeStuff() - removes all stuff away
         -- boolean isEmpty() - returns true if there is no stuff inside
         -- int getFreeSpace() - returns an integer value of free millilitres
         -- void open() - forces Containable to be opened
        -- void close() - forces Containable to be closed*/

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