package main.java.tasks.unit;

import java.util.ArrayList;
import java.util.List;

//- в главном потоке создать коллекцию из 280 мышей
//- создать 5 дочерних потоков, в каждом из которых:
//- каджые 300мс удалять 1 пикающую мышь
//- запустить потоки
public class MouseTaskFour {

    public static List<Mouse> mouseList = new ArrayList<>();

    public static void createCollec() {
        for (int i = 1; i < 280 + 1; i++) {
            mouseList.add(new Mouse(i));
        }
    }

    public static void main(String[] args) {

        createCollec();

        new Thread(() -> {
            for (int i = 0; i < mouseList.size(); i++) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < mouseList.size(); i++) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < mouseList.size(); i++) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < mouseList.size(); i++) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < mouseList.size(); i++) {
                try {
                    mouseList.remove(i).peep();
                    Thread.currentThread().sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }


}
