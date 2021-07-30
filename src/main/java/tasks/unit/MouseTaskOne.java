package main.java.tasks.unit;

// ****** * 1) создать коллекцию из 20 мышей и запустить потоки одновременно

import java.util.ArrayList;
import java.util.List;

public class MouseTaskOne {

    public static void main(String[] args) {

/*        List<Mouse> mouses = new ArrayList<>();
        for (int i = 1; i < 20 + 1; i++) {
            mouses.add(new Mouse(i));
        }*/

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 20 + 1; i++) {
                new Mouse(i).peep();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i < 20 + 1; i++) {
                new Mouse(i).peep();
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 1; i < 20 + 1; i++) {
                new Mouse(i).peep();
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 1; i < 20 + 1; i++) {
                new Mouse(i).peep();
            }
        });
        Thread thread5 = new Thread(() -> {
            for (int i = 1; i < 20 + 1; i++) {
                new Mouse(i).peep();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
