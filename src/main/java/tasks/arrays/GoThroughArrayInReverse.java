package main.java.tasks.arrays;
import java.util.Random;
// вывести в консоль все элементы массива в обратном порядке

public class GoThroughArrayInReverse {

    static void arrayInReverse() {
        int[] array2 = new int[5];
        Random random = new Random();
        System.out.println("Исходный массив: ");
        for (int l = 0; l < array2.length ; l++) {
            System.out.println(array2[l] = random.nextInt(50));
        }
        System.out.println("Массив в обратном порядке: ");
        for (int l = array2.length-1; l>=0; l--) {
            System.out.println(array2[l]);
        }

    }
}
