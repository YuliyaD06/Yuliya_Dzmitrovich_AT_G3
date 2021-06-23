package main.java.tasks.day4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

// написать метод, который выводит в консоль текущую дату и время в формате:
//Сейчас на дворе:
//19 сентября, 2020, 3 часа 13 минут
public class CurrentDate {

    public static void main(String[] args) {
/*        System.out.println("Time now:");
        LocalDate dateNow = LocalDate.now();
        int day = dateNow.getDayOfMonth();
        int year = dateNow.getYear();
        String month = String.valueOf(dateNow.getMonth());
        String monthInSmall = month.toLowerCase(Locale.ENGLISH);
        LocalTime timeNow = LocalTime.now();
        int hour = timeNow.getHour();
        int minutes = timeNow.getMinute();
        String date = day + " " + monthInSmall + ", " + year + ", ";
        String time = hour + " hours " + minutes + " minutes";
        System.out.println(date+time);*/

        System.out.println("Time now:");
        Date date = new Date();
        SimpleDateFormat updateDate = new SimpleDateFormat("dd MMMM, YYYY, h hours mm minutes");
        System.out.println(updateDate.format(date));
    }
}