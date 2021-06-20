package main.java.tasks.day3;
// -- написать метод, который подсчитает сумму каждого
// n-ого элемента в целочисленном массиве, где n - целое число,
// передаваемое в сигнатуру этого метода

import java.util.Random;

public class SumOfElements {

    public void sum(int n) {
        System.out.println("n = " + n);
        int[] array = new int[10];
        Random random = new Random();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] = random.nextInt(20));
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == n) {
                sum = array[i];
                System.out.println("Сумма каждого n-го элемента в массиве = " + sum);
            }
        }
    }

}