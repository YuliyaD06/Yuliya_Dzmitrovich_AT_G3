package main.java.tasks.collections;
//Создать пустой список noodles
//Добавить в список 4 вида макарон (Hakka, Ramen, Hibachi, Schezwan)
//Проитерировать список через for-each и отпечатать слова в консоль через тире
//Заменить в каждом слове буквы "а" на букву "о"
//Проитерировать список по индексу и отпечатать слова в консоль через пробел

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Noodles {
    public static void main(String[] args) {
        List<String> pastaList = new ArrayList<>();
        pastaList = Arrays.asList("Hakka", "Ramen", "Hibachi", "Schezwan");

        for (String one : pastaList){
            System.out.print(one + "-");
        }
        for (String one : pastaList){
            String replaced = one.replaceAll("a", "o");
            pastaList.add(replaced);
        }
        System.out.println();
        for (int i = 0; i < pastaList.size(); i++){
            System.out.print(pastaList.get(i) + " ");
        }
    }
}
