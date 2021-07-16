package main.java.tasks.lambda;
//- для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах,
// певерести значения в сантиметры и найти сумму

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class EvenNumbers {
    public static void main(String[] args) {
        //List<Integer> inchesList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
/*        List<Integer> inchesList = new ArrayList<>();
        for (int i =1; i < 21; i++){
            inchesList.add(i);
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(inchesList.stream().map(x -> x % 2 == 0 ? x * 2.54 : 0).reduce((x, y)-> x+y).get());*/

        System.out.println(IntStream.rangeClosed(1, 20).boxed().map(x -> x % 2 == 0 ? x * 2.54 : 0)
                .reduce((x, y)-> x+y).get());
    }
}
