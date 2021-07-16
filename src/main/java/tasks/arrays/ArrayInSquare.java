package main.java.tasks.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// каждый элемент массива возвести в квадрат и вывести результат в консоль

public class ArrayInSquare {
    void inSquare(){
        int[] array4 = new int[3];
        Random random = new Random();
        System.out.println("исходный массив: ");
        for (int l = 0; l < array4.length ; l++){
            System.out.println(array4[l] = random.nextInt(100));
        }
        System.out.println("массив, возведенный в квадрат: ");
        for (int l = 0; l < array4.length ; l++){
            System.out.println(array4[l]=array4[l]*array4[l]);
        }
    }

    public static void main(String[] args) {
        int b = 20;
        List<Integer> listOfNum = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            int a = (int) (Math.random() * 20);
            listOfNum.add(a);
        }

        listOfNum.stream().map(number -> number*number).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Variant 2:");
        Stream.generate(() -> (int) (Math.random() * 10)).limit(5).map(num -> num * num).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}