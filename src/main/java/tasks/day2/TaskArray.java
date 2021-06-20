package main.java.tasks.day2;
import java.util.Random;
// создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)

public class TaskArray {
    static void arrayRandom() {
        int[] array = new int[7];
        Random random = new Random();
        for (int l : array) {
            array[l] = random.nextInt(7);
        }

    }
}
