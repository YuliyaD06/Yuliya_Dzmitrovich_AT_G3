package main.java.tasks.unit;

import java.util.ArrayList;
import java.util.List;

//- в главном потоке создать коллекцию из 380 мышей
//- создать 7 дочерних потоков, в каждом из которых:
//- каджые 250мс удалять 1 пикающую нечетную мышь
//- запустить потоки
public class MouseTaskFive {
    public static List<Mouse> mouseList = new ArrayList<>();

    public static void createCollec() {
        for (int i = 1; i < 280 + 1; i++) {
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
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
