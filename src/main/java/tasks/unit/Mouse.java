package main.java.tasks.unit;

import java.util.regex.Pattern;

//private String pattern - содержит паттерн имени мыши формате "Mouse <n>", где n - порядковый номер мыши
//private String name - имя мыши в формате "Mouse <n>", где n - порядковый номер мыши
//конструктор public Mouse(int number) - в нем инициализируется поле name
//метод public void peep() - печатает в консоль фразу в формате "Mouse <n> PEEP!",
// где n - порядковый номер мыши и заставляет поток заснуть на 200мс

public class Mouse {

    private String pattern = "Mouse <%s>";
    private String name;


    public Mouse(int number) {
        name = String.format("Mouse <%s>", number);
    }

    public void peep() {
        System.out.println(getName() + " PEEP!");

        new Thread(() -> {
            try {
                Thread.currentThread().sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
    }

    public String getName() {
        return name;
    }


}
