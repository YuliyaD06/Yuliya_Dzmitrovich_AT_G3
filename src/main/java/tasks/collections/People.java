package main.java.tasks.collections;

import java.util.ArrayList;
import java.util.List;

//Создать пустой список людей people
//Заполнить 4 людьми с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
//Проитерировать список через for-each и отпечатать возраст в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки
public class People {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<Person>();
        peopleList.add(new Person("Коля", 32));
        peopleList.add(new Person("Оля", 24));
        peopleList.add(new Person("Вася", 55));
        peopleList.add(new Person("Маша", 63));

        for (Person person : peopleList) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println();
        for (Person person : peopleList) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();
        for (int person = 0; person < peopleList.size(); person++) {
            System.out.println(peopleList.get(person).toString());
        }

    }
}
