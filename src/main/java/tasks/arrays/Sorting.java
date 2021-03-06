package main.java.tasks.arrays;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
    void toSort() {
        int[] array10 = new int[5];
        Random random = new Random();
        System.out.println("исходный массив: ");
        for (int l = 0; l < array10.length; l++) {
            System.out.println(array10[l] = random.nextInt(15));
        }
        boolean isSorted = false;
        while (isSorted) {
            isSorted = true; //изначально мы предполагаем, что массив отсортирован
            for (int l = 0; l < array10.length - 1; l++) {
                if (array10[l] < array10[l + 1]) {
                    isSorted = false; // есть обмен, поэтому массив все еще не отсортирован

                    int tempo = array10[l];
                    array10[l] = array10[l + 1];
                    array10[l + 1] = tempo;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int l = 0; l < array10.length - 1; l++) {
            System.out.println(array10[l]);
        }
    }

    public static void main(String[] args) {
        Stream.generate(() -> (int)(Math.random() * 20)).limit(10).sorted().collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
