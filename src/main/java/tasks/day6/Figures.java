package main.java.tasks.day6;
//Создать список строк figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать слова в в файл figures через тире
//Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Вставить на 3 позицию Треугольник
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) throws IOException {
        String[] originalList = {"Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"};
        List<String> figuresList = Arrays.asList(originalList);
        String fileName = "figures.txt";

        /* ****Запись в файл ?????
        for (String figure : figuresList) {
            System.out.print(figure + "-");
        }
        public void write (String fileName) throws IOException {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.write();
            out.close();
        }*/
        System.out.println();
        int counter = 0;
        for (String figure : figuresList) {
            if (!(figure.contains("и"))) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int figure = 0; figure < figuresList.size(); figure++) {
            System.out.print(figuresList.get(figure) + " ");
        }
        System.out.println();
        figuresList.set(3, "Треугольник");
        for (String figure : figuresList) {
            System.out.print(figure + " ");
        }
    }
}
