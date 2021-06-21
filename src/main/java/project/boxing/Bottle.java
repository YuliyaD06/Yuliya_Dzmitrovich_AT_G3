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
        System.out.printf("The bottle of "+ volume + " volume is created.").println();
        Bubble[] bubbles = new Bubble[(int)(10*volume)];
        int i;
        for (i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("gas");
        }
        System.out.printf("There are " + i + " bubbles in the bottle.").println();
        water.cramp(bubbles);
    }

    public void open(){
        this.water.setOpened(true);
        System.out.printf("The bottle is opened.").println();
        this.water.degas();
    }
    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        water = new SparklingWater();
    }
    public void warm(int temperature){
        this.water.temperature = temperature;
    }

}