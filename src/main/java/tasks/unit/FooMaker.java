package main.java.tasks.unit;
//- создать класс FooMaker с полем private int random - рандомное целое число от 0 до 100
//- методы:
//public int getDayOfWeek() - возвращает цифру текущего дня недели
//public int getDayOfWeek(int next) - возвращает цифру дня недели следующего через количество дней next
//public int getNextDayOfWeek() - возвращает цифру текущего дня недели + 1
//public int getDayFoo() - возвращает цифру дня недели следующего через количество дней next
//public int getRandom() - возвращает значение поля random

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FooMaker {

    private int random = (int) (Math.random() * 100);

    LocalDate date = LocalDate.now();
    DayOfWeek weekDay = date.getDayOfWeek();

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

    public int getRandom() {
        return random;
    }

    public LocalDate getDate() {
        return date;
    }

    public DayOfWeek getWeekDay() {
        return weekDay;
    }
}
