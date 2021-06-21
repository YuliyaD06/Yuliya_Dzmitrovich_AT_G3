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
    public boolean isSparkle;

    public SparklingWater(){
        isOpened();
    }
    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;

    }

    public void degas() { //private or public
        int numberOfBubbles = bubbles.length;
        System.out.printf("Starting degas process...").println();
        for (int i = 0; i < numberOfBubbles - 1; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }
        System.out.println("Degassing is finished.");
    }
    public void setOpened(boolean isOpened){
        this.isOpened = true;
    }

    private void isOpened() {

    }

    public boolean isSparkle() {
        return isSparkle;
    }

    @Override
    public void cramp(Bubble[] bubbles) {

    }
}
