package main.java.tasks.day3;
/*написать метод, который подсчитает сумму каждого
n-ого элемента в целочисленном массиве, где n - целое число, передаваемое в сигнатуру этого метода*/

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
        int[] tempo = new int[array.length];
        int counter = 0;

        for (int i = n - 1; i < array.length; i += n) {
            tempo[counter++] = array[i];
        }

        int[] last = new int[counter];
        System.out.println("Выбранный массив: ");
        for (int i = 0; i < counter; i++) {
            last[i] = tempo[i];
            System.out.println(last[i]);
        }

        for (int i = 0; i < last.length; i++) {
            sum += last[i];
        }
        System.out.println("Сумма каждого n-го элемента в массиве = " + sum);
    }

}