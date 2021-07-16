package main.java.tasks.arrays;
// поменять местами первый и последний элементы и вывести результат в консоль

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChangeElements {

    static void change() {
        int[] array9 = new int[6];
        Random random = new Random();
        System.out.println("исходный массив: ");
        for (int l = 0; l < array9.length; l++) {
            System.out.println(array9[l] = random.nextInt(15));
        }
        int x = array9[0];
        array9[0] = array9[array9.length - 1];
        array9[array9.length - 1] = x;

        System.out.println("Первый элемент " + array9[0]);
        System.out.println("последний элемент " + x);

        for (int l : array9) {
            System.out.println(array9);
        }
    }

    public static void main(String[] args) {
        List<Integer> elementsList = Arrays.asList(3, 5, 9, 7);
        System.out.println("Первый элемент " + elementsList.stream().findFirst().get());
        System.out.println("последний элемент " + elementsList.stream().sorted((x, y) -> -x.compareTo(y)));
    }
}
