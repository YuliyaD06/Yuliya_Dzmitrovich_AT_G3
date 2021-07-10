package main.java.tasks.collections;

import java.util.ArrayList;
import java.util.List;

//Создать пустой список elements
//Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
//Проитерировать список через for-each и отпечатать слова в консоль через пробел
//Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//На 4-ю позицию добавить Spinner
//Удалить 2-й элемент списка
//Заменить 5-й элемент на Switch
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

public class Elements {
    public static void main(String[] args) {
        List<String> elementsList = new ArrayList<>();
        elementsList.add("Text field");
        elementsList.add("Radio");
        elementsList.add("Check-box");
        elementsList.add("Drop-down");
        elementsList.add("Picker");
        elementsList.add("Breadcrumb");
        int counter = 0;

        for (String element: elementsList){
            System.out.print(element + " ");
        }
        for (String element: elementsList){
            if (element.contains("-")){
                counter++;
            } else if (element.contains(" ")){
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
        for (int element = 0; element < elementsList.size(); element++){
            System.out.print(element + " ");
        }
        System.out.println();
        elementsList.set(4, "Spinner");
        elementsList.remove(2);
        elementsList.add(5, "Switch");
        for (String element: elementsList){
            System.out.print(element + " ");
        }

    }
}
