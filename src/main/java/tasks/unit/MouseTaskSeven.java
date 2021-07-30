package main.java.tasks.unit;

import java.util.ArrayList;
import java.util.List;
//- в главном потоке создать коллекцию из 240 мышей
//- создать 5 дочерних потоков
//- 3 из которых каджые 250мс удалять 1 пикающую нечетную мышь
//- 2 из которых каджые 220мс заменяют 1 пикающую четную мышь на ежа, который сообщает о себе
//- запустить потоки
public class MouseTaskSeven {
    public static List<Mouse> mouseList = new ArrayList<>();

    public static void createCollec() {
        for (int i = 1; i < 240 + 1; i++) {
            mouseList.add(new Mouse(i));
        }
    }

    public static void main(String[] args) {
        createCollec();
        new Thread(() -> {
            for (int i = 1; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 1; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 1; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 1; i < mouseList.size(); i=i+2) {
                try {
                    Hedgehog hedgehog = new Hedgehog(i);
                    //mouseList.set(i,new Hedgehog(i));
                    Thread.currentThread().sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
