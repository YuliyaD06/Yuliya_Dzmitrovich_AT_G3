package main.java.tasks.day5;
// - Написать метод, который выводит следующий месяц от
// заданного во входном параметре. Входной параметр ввести с клавиатуры

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class NextMonth {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        Month currentMonthName = today.getMonth();
        int currentMonthNumber = today.getMonthValue();
        int nextMonthNumber;


        System.out.println(currentMonthName);
        System.out.println(currentMonthNumber);

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            Integer currentMonth = scanner.nextInt();
            scanner.findInLine(String.valueOf(currentMonthNumber));

            if (currentMonth.equals(currentMonthNumber)){
                System.out.println("The current month: " + currentMonthNumber + ", " + Month.of(currentMonthNumber));
                nextMonthNumber = currentMonthNumber + 1;
                System.out.println("The next month: " + nextMonthNumber + ", " + Month.of(nextMonthNumber));
                return;
            }

        }

    }
}
