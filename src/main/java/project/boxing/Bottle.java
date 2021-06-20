package main.java.project.boxing;
// Bottle:
//++ содеждит приватные поля double volume, SparklingWater water
//++ есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
//++ есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
//++ есть публичный метод SparklingWater getWater() возвращающий обьект воды
//-- есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды

import main.java.project.composition.Bubble;
import main.java.project.composition.SparklingWater;
import main.java.project.composition.Water;

public class Bottle {
    private double volume;
    private SparklingWater water = new SparklingWater();
    boolean opened;

    public Bottle(double volume) {
        this.volume = volume;
        Bubble[] bubbles = new Bubble[(int)(10000*volume)];
        for (int l = 0; l < bubbles.length; l++) {
            bubbles[l] = new Bubble("gas");
        }
        water.cramp(bubbles);
    }
    public void open(){
        this.water.setOpened(true);
        this.water.degas();
        System.out.println("Bottle is opened.");
    }
    public void warm(int temperature){
        water.temperature = temperature;
    }
    public SparklingWater getWater() {
        return water;
    }
    public void setWater(SparklingWater water) {
        this.water = water;
    }
}