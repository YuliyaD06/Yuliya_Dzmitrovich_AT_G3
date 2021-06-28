package main.java.project.composition;
//SparklingWater:
//++наследуется от Water
//++содеждит приватные поля boolean isOpened, Bubble[] bubbles
//++содержит конструктор SparklingWater(), который вызывает внутренний метод isOpened();
//++есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
//++есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
//------есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость" и в случае,
// если она открыта запускает метод degas()
//------ есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
//------ есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
//-- каждый метод должен содержать сообщение о том, что он делает, например:
//System.out.printf("Warming water to: %s", temperature).println();
//-- сообщения должны быть написаны 1-й строкой System.out.print* (пример см строкой выше)

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;
    private boolean isSparkle;

    public SparklingWater() {
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        int i;
        for (i = 0; i < bubbles.length; i++) {
            Bubble bubble = new Bubble("gas");
            bubble = bubbles[i];
        }
        System.out.printf("There are " + i + " bubbles in the bottle.").println();
    }

    public void degas() {
        int numberOfBubbles = bubbles.length;
        int speed = 10 + 5;
        int time = numberOfBubbles / speed;
        System.out.printf("Starting degas process...").println();

        for (int i = 0; i < bubbles.length - 1; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }

        System.out.println("Degassing is finished.");
    }

    private void isOpened() {
        if (this.isOpened){
            degas();
        }
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
        System.out.printf("The bottle is opened.").println();
    }

        public boolean isSparkle () {
            return isSparkle;
        }

        @Override
        public void cramp (Bubble[]bubbles){

        }
    }
