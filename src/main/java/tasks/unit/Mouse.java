package main.java.tasks.unit;

import java.util.regex.Pattern;

//private String pattern - содержит паттерн имени мыши формате "Mouse <n>", где n - порядковый номер мыши
//private String name - имя мыши в формате "Mouse <n>", где n - порядковый номер мыши
//конструктор public Mouse(int number) - в нем инициализируется поле name
//метод public void peep() - печатает в консоль фразу в формате "Mouse <n> PEEP!",
// где n - порядковый номер мыши и заставляет поток заснуть на 200мс

public class Mouse {

    private String pattern = "Mouse" ;
    private String name;
    int n;


    public Mouse(int number) {
        this.n = number;
/*        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n; i++){
            builder.append(n);
        }*/
    }

    public void peep(){
        System.out.println("Mouse " + "<n>" + " PEEP!");

        new Thread(() -> {
            try {
                int secToWait = 1000 * 2;
                Thread.currentThread().sleep(secToWait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
    }

}
