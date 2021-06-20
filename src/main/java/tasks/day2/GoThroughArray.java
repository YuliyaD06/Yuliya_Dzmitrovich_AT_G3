package main.java.tasks.day2;

import java.util.Random;

// пройти по массиву и вывести в консоль все элементы

public class GoThroughArray {
    static void printArray() {
        int[] array1 = new int[7];
        Random random = new Random();
        for (int l = 0; l < array1.length ; l++) {
            array1[l] = random.nextInt(50);
        }
        for (int l=0; l < array1.length; l++) {
            System.out.println(array1[l]);
        }
    }
}