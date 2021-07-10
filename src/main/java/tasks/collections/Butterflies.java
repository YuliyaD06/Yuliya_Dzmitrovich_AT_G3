package main.java.tasks.collections;
//Создать пустой список butterflies (через нью)
//Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
//Проитерировать список через for-each и отпечатать слова в консоль в кавычках
//Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Проитерировать список через for-each и отпечатать слова в консоль через перенос строки

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        int counter = 0;

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String oneButterfly : butterflies) {
            System.out.print("\"" + oneButterfly + "\"" + " ");
        }
        System.out.println();
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")){
                counter++;
            }
        }
        System.out.println(counter);

        for (int butterfly = 0; butterfly < butterflies.size(); butterfly++){
            System.out.print(butterflies.get(butterfly) + " ");
        }
        System.out.println();
        System.out.println();
        for (String oneButterfly : butterflies) {
            System.out.println(oneButterfly);
        }
    }
}
