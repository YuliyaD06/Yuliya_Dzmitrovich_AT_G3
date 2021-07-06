package main.java.tasks.day6;
//Создать пустой список cities
//Добавить в список 3 города (Минск, Москва, Берлин)
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки
//Посчитать сумму всех буков во всех словах и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> citiesList = new ArrayList<>();
        citiesList.add("Минск");
        citiesList.add("Москва");
        citiesList.add("Берлин");

        int lettersNumber = 0;

        for (String city : citiesList) {
            System.out.println(city);
        }


        for (String city : citiesList) {
            lettersNumber = lettersNumber + city.length();
        }

        System.out.println(lettersNumber);
        System.out.println();

        for (int city = 0; city < citiesList.size(); city++){
            System.out.print(citiesList.get(city) + " ");
        }
    }
}
