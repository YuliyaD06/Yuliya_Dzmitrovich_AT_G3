package main.java.tasks.unit;
//- создать 6 потоков, в каждом из которых:
//-- создать коллекцию из 26 мышей
//-- проитерировать коллекцию и пикнуть каждой нечетной мышью
//- запустить потоки
public class MouseTaskThree {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 26 + 1; i = i+2) {
                new Mouse(i).peep();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i < 26 + 1; i = i+2) {
                new Mouse(i).peep();
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 1; i < 26 + 1; i = i+2) {
                new Mouse(i).peep();
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 1; i < 26 + 1; i = i+2) {
                new Mouse(i).peep();
            }
        });
        Thread thread5 = new Thread(() -> {
            for (int i = 1; i < 26 + 1; i = i+2) {
                new Mouse(i).peep();
            }
        });
        Thread thread6 = new Thread(() -> {
            for (int i = 1; i < 26 + 1; i = i+2) {
                new Mouse(i).peep();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
