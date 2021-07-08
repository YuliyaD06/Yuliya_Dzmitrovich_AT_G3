package main.java.tasks.day6;

import java.util.*;

//Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль новой строки
//Посчитать сумму всех чисел и вывести результат в консоль
//Отсортировать список по возрастанию
//Проитерировать список по индексу и отпечатать числа в консоль через пробел
//Развернуть список в обратном порядке
//Проитерировать список через for-each и отпечатать числа в консоль через пробел
public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        int sum = 0;
        for (int number : numbersList){
            System.out.println(number);
        }
        for (int number = 0; number < numbersList.size(); number++){
            sum = sum + numbersList.get(number);
        }
        System.out.println("The sum of numbers = " + sum);
        System.out.println("The list after sorting: ");
        Collections.sort(numbersList);
        for (int number = 0; number < numbersList.size(); number++){
            System.out.print(numbersList.get(number) + " ");
        }
        System.out.println();
        System.out.println("The list after sorting: ");
        Collections.sort(numbersList, Collections.reverseOrder());
        for (int number : numbersList){
            System.out.print(number + " ");
        }
    }
}
