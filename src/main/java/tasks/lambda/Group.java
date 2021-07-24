package main.java.tasks.lambda;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//- создать класс Person, с полями name, surname, age. Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
// Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых меньше 21, выводит их
// имена и возраст в консоль, сортирует по фамилии, а потом по имени(использовать thenComparing у объекта Comparator),
// берет 4 первых человека, формирует коллекцию из имен объектов, собирает все в коллекцию
public class Group {
    public static void main(String[] args) {



    }
}

//или, например, делать специализированный интстрим, который поддерживает понятие диапазона:
//IntStream.rangeClosed(1, 10).boxed().map(i -> new Bottle("name " + i)).collect(Collectors.toList()).forEach(System.out::println); - тут создадим 10 новых бутылок с уникальными именами
//*метод boxed() - специфическая штука, которая примитивные инты автоматом упакует в обьект Integer
