//написать метод, который вернет сумму тех элементов целочисленного массива, которые кратны числу текущего месяца
package main.java.tasks.day3;

import java.time.LocalDate;
import java.util.Random;
import java.util.stream.Stream;

public class ReturnArray {
    LocalDate today = LocalDate.now();
    int month = today.getMonthValue();
    int sum = 0;

    public void arrayMonth() {
        System.out.println("Номер текущего месяца: " + month);
        //int[] arrayMonthNow = {6, 12, 18};
        int[] arrayMonthNow = new int[10];
        Random random = new Random();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arrayMonthNow.length; i++) {
            System.out.println(arrayMonthNow[i] = random.nextInt(150));
        }
        for (int l = 0; l < arrayMonthNow.length; l++) {
            if (arrayMonthNow[l] % month == 0) {
                sum += arrayMonthNow[l];
                System.out.println("Элемент, кратный текущему месяцу: " + arrayMonthNow[l]);
            }
        }
        System.out.println("Сумма элементов, кратных номеру текущего месяца = " + sum);
        if (sum == 0) {
            System.out.println("Элементы, кратные номеру текущего месяца, отсутствуют.");
        }
    }

    public static void main(String[] args) {

        Stream.generate(() -> (int)(Math.random() * 30)).limit(15).filter(num -> num % LocalDate.now().getMonthValue() == 0)
                .forEach(System.out::println);
    }
}
