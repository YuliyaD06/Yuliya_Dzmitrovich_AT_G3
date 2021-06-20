package main.java.tasks.day2;

import java.util.Random;

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
}
