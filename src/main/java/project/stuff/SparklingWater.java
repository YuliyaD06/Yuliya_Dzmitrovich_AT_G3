package main.java.project.stuff;
//SparklingWater:
//++наследуется от Water
//++содеждит приватные поля boolean isOpened, Bubble[] bubbles
//++содержит конструктор SparklingWater(), который вызывает внутренний метод isOpened();
//++есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
//++есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
//++есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость" и в случае,
// если она открыта запускает метод degas()
//++ есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды

//----??? есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
//----??? public SparklingWater(), конструктор, который сетает нужное количество пузырьков из рассчета, что 1 литр воды содержит 10 тыс пузырьков и вызывает внутренний метод isOpened();
//++ private isOpened(), который раз в 2 секунды (используем Thread.sleep()) проверяет, состояние закрытости в
// бутылке и если бутылка открылась, то запускает внутренний метод degas()


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SparklingWater extends Water {
    private boolean isOpened;
    List<Bubble> bubbles = new LinkedList<Bubble>();
    private boolean isSparkle;
    private double volume;


    public SparklingWater() {
        isOpened();

        Bubble[] bubbles = new Bubble[(int)(10000 * volume)];
        List<Bubble> bubble = Arrays.asList(bubbles);
        for (int i = 0; i < bubble.size(); i++) {
            bubble.set(i, new Bubble("gas"));
        }
        pump(bubble);

    }

    public void pump(List<Bubble> bubbles) {
        this.bubbles = bubbles;
        System.out.printf("There are " + bubbles.size() + " bubbles in the bottle.").println();
    }

    public void degas(List<Bubble> bubbles) {
        this.bubbles = bubbles;
        int speed = 10 + 5 * getTemperature();
        System.out.printf("Starting degas process... ").println();

        for (Bubble oneBubble : bubbles) {
            bubbles.stream().skip(speed);
            oneBubble.cramp();
        }
        System.out.println();
        System.out.printf("Degassing is finished.").println();
    }

    private void isOpened() {

        new Thread(() -> {
            for (int i = 0; i < bubbles.size(); i++) {
                try {
                    int secToWait = 1000 * 2;
                    Thread.currentThread().sleep(secToWait);
                    System.out.println("Check the \"opened\" state...");
                    if (this.isOpened) {
                        degas(bubbles);
                        System.out.println("The bottle is opened. Degas process is started.");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
        System.out.printf("The bottle is opened.").println();
    }

    public boolean isSparkle() {
        if (bubbles == null) {
            isSparkle = true;
        }
        return isSparkle;
    }


}
