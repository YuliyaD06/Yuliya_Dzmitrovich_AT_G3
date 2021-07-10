package main.java.tasks.day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Создать пустой список песка sandbox
//Заполнить 4 обьектами песка с весом (2, 4, 2, 7) и именами (Речной, Речной, Карьерный, Речной) соответственно
//Проитерировать список через for-each и отпечатать вес в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Создать пустую карту, где ключем является целое число, а значением обьект песка
//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
//Проитерировать карту и отпечатать ключи в консоль
//Проитерировать карту и отпечатать значения в консоль
//Проитерировать карту и отпечатать пары ключ-значение в консоль

public class Sandbox {
    public static void main(String[] args) {
        List<Sand> sandboxList = new ArrayList<>();
        sandboxList.add(new Sand(2, "Речной"));
        sandboxList.add(new Sand(4, "Речной"));
        sandboxList.add(new Sand(2, "Карьерный"));
        sandboxList.add(new Sand(7, "Речной"));

        for (Sand weight : sandboxList){
            System.out.print(weight.getWeight() + " ");
        }
        System.out.println();
        for (Sand name : sandboxList){
            System.out.print(name.getName() + " ");
        }
        System.out.println();
        Map<Integer, Sand> sandboxMap = new HashMap<>();
        for (int i = 0; i < sandboxList.size(); i++){
            sandboxMap.put(i, sandboxList.get(i));
        }

        for (Integer key : sandboxMap.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();
        for (Sand value : sandboxMap.values()){
            System.out.print(value.getName() +", " + value.getWeight() + ";  ");
        }
        System.out.println();
        System.out.println();
        for (Map.Entry<Integer, Sand> couple : sandboxMap.entrySet()){
            System.out.println(couple.getKey() + " - " + couple.getValue().toString() + ";");
        }

    }
}
