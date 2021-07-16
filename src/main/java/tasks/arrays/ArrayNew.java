package main.java.tasks.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// каждый элемент массива умножить на 5 и вывести результат в консоль

public class ArrayNew {
    static void multiply() {
        int[] array3 = new int[3];
        Random random = new Random();
        System.out.println("исходный массив: ");
        for (int l = 0; l < array3.length; l++) {
            System.out.println(array3[l] = random.nextInt(100));
        }
        System.out.println("массив, умноженный на 5: ");
        for (int l = 0; l < array3.length; l++) {
            System.out.println(array3[l] = array3[l] * 5);
        }
    }

    public static void main(String[] args) {
        List<Integer> listOfN = Arrays.asList(3, 5, 8);
        listOfN.stream().map(number -> number * 5).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Variant 2: ");
        Stream.generate(() -> (int) (Math.random() * 15)).limit(5).map(num -> num * 5)
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
