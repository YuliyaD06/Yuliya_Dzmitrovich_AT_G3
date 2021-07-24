package main.java.tasks.unit;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

        Runner runner = new Runner();

        if ((runner.getDayOfWeek() + 2) == runner.getDayOfWeek(2)) {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }

    }


    LocalDate date = LocalDate.now();
    DayOfWeek weekDay = date.getDayOfWeek();

    public int getDayFoo(){
        int next = 3;
        date = date.plusDays(next);
        weekDay = date.getDayOfWeek();
        return switch (weekDay) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            case WEDNESDAY -> 3;
            case THURSDAY -> 4;
            case FRIDAY -> 5;
            case SATURDAY -> 6;
            case SUNDAY -> 7;
        };
    }

    public int getDayOfWeek(int next){
        date = date.plusDays(next);
        weekDay = date.getDayOfWeek();
        return switch (weekDay) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            case WEDNESDAY -> 3;
            case THURSDAY -> 4;
            case FRIDAY -> 5;
            case SATURDAY -> 6;
            case SUNDAY -> 7;
        };
    }
    public int getDayOfWeek(){
        return switch (weekDay) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            case WEDNESDAY -> 3;
            case THURSDAY -> 4;
            case FRIDAY -> 5;
            case SATURDAY -> 6;
            case SUNDAY -> 7;
        };
    }

    public int getNextDayOfWeek(){
        date = date.plusDays(1);
        weekDay = date.getDayOfWeek();
        return switch (weekDay) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            case WEDNESDAY -> 3;
            case THURSDAY -> 4;
            case FRIDAY -> 5;
            case SATURDAY -> 6;
            case SUNDAY -> 7;
        };
    }


}
