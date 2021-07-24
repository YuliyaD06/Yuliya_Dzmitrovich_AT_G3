package main.java.tasks.dates;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

// написать метод, который выводит в консоль текущую дату и время в формате:
//Сейчас на дворе:
//19 сентября, 2020, 3 часа 13 минут
public class CurrentDate {

    public static void main(String[] args) {
        System.out.println("Time now:");
        Date date = new Date();
        SimpleDateFormat updateDate = new SimpleDateFormat("dd MMMM, YYYY, h hours mm minutes");
        System.out.println(updateDate.format(date));
    }
}