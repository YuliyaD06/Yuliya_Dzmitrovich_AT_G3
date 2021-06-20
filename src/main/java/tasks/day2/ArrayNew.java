package main.java.tasks.day2;

import java.util.Random;

// каждый элемент массива умножить на 5 и вывести результат в консоль

public class ArrayNew {
    static void multiply(){
        int[] array3 = new int[3];
        Random random = new Random();
        System.out.println("исходный массив: ");
        for (int l = 0; l < array3.length ; l++){
            System.out.println(array3[l] = random.nextInt(100));
        }
        System.out.println("массив, умноженный на 5: ");
        for (int l = 0; l < array3.length ; l++){
            System.out.println(array3[l]=array3[l]*5);
        }

    }

}
