package main.java.tasks.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
public class TaskFor {
    static void printOddNumber() {
        for (int a = 3; a < 20; a++) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numList.add(i + 1);
        }
        numList.stream().map(num -> num % 2 != 0 ? num : 0).filter(num -> 3 <= num && num <= 19)
                .forEach(System.out::println);
    }
}
