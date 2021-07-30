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
import java.util.Calendar;

public class FooMaker {

    private int random = (int) (Math.random() * 100);

    public int getDayOfWeek(){
        return Calendar.DAY_OF_WEEK;
    }

    public int getDayOfWeek(int next){
        return Calendar.DAY_OF_WEEK + next;
    }

    public int getNextDayOfWeek(){
        return Calendar.DAY_OF_WEEK + 1;
    }

    public int getDayFoo(){
        return Calendar.DAY_OF_WEEK + getRandom();
    }

    public int getRandom() {
        return random;
    }
}
