package main.java.tasks.day4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//написать метод, который принимает на вход строку с датой и временем в формате
// "22.00 07.09.2020" и выводит в консоль в формате "September, 7, 2020 22:00"
public class StringConversation {

    public static void main(String[] args) throws ParseException {
        String date = "22.00 07.09.2020";
        System.out.println("Date before formatting: " + date);

        DateFormat input = new SimpleDateFormat("HH.mm dd.MM.YYYY");
        DateFormat formatter = new SimpleDateFormat("MMMM, dd, YYYY HH:mm");
        Date parsedInput = input.parse(date);
        String result = formatter.format(parsedInput);

        System.out.println("Date after parsing: "  + result);

    }
}

/*
    DateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
    Date date = formatter.parse("21/03/2001");
    System.out.println(date);*/
