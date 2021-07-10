package main.java.tasks.collections;

import java.util.Arrays;
import java.util.List;

//Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль черезе пробел
//Посчитать произведение всех чисел и вывести результат в консоль
//найти сумму всех дробных частей и вывести результат в консоль
//Проитерировать список по индексу и челые части в консоль через пробел
public class Doubles {
    public static void main(String[] args) {
        List<Double> doublesList = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        long multiplication = 1;
        int integer;
        int sum = 0;

        for (Double number : doublesList) {
            System.out.println(number + " ");
        }
        for (int number = 0; number < doublesList.size() - 1; number = number + 2) {
            multiplication *= (doublesList.get(number) * doublesList.get(number + 1));
        }
        System.out.println("Multiplication of numbers" + multiplication);
        for (Double number : doublesList){
            integer = number.intValue();
            sum += integer;
        }
        System.out.println("The sum of integer numbers =" + sum);
        for (int number = 0; number < doublesList.size(); number++) {
            integer = doublesList.get(number).intValue();
            System.out.print(integer + " ");
        }

    }
}
