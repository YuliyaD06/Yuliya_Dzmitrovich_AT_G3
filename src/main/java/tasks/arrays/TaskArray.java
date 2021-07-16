package main.java.tasks.arrays;
import java.util.Random;
import java.util.stream.Stream;
// создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)

public class TaskArray {
    static void arrayRandom() {
        int[] array = new int[7];
        Random random = new Random();
        for (int l : array) {
            array[l] = random.nextInt(7);
        }
    }

    public static void main(String[] args) {
        Stream.generate(() -> (int)(Math.random()*20)).limit(7).forEach(System.out::println);
    }
}
