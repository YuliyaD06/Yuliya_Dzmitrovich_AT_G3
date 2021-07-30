package main.java.tasks.unit;

import java.util.ArrayList;
import java.util.List;

//- в главном потоке создать коллекцию из 420 мышей
//- создать 6 дочерних потоков, в каждом из которых:
//- каджые 170мс удалять 1 пикающую четную мышь
//- запустить потоки
public class MouseTaskSix {
    public static List<Mouse> mouseList = new ArrayList<>();

    public static void createCollec() {
        for (int i = 1; i < 420 + 1; i++) {
            mouseList.add(new Mouse(i));
        }
    }

    public static void main(String[] args) {
        createCollec();
        new Thread(() -> {
            for (int i = 2; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(170);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 2; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(170);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 2; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(170);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 2; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(170);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 2; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(170);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 2; i < mouseList.size(); i=i+2) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(170);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
