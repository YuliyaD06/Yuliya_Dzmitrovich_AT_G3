package main.java.tasks.day6;
//Создать список пузырей furniture из 3 стульев высотой (1, 4, 2) и шириной (2, 2, 4) соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
//Создать пустую карту, где ключем является целое число, а значением обьект стула
//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
//Проитерировать карту и отпечатать ключи в консоль
//Проитерировать карту и отпечатать значения в консоль
//Проитерировать карту и отпечатать пары ключ-значение в консоль

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Furniture {
    public static void main(String[] args) {
        List<Chair> furnitureList = Arrays.asList(new Chair(1,2), new Chair(4,2), new Chair(2,4));

        for (Chair chair : furnitureList){
            System.out.println((chair.getHeight() * chair.getWidth() + " "));
        }
        Map<Integer,Chair> furnitureMap = new HashMap<>();
        for (int i = 0; i < furnitureMap.size(); i++){
            furnitureMap.put(i, furnitureList.get(i));
        }
        for (Integer key : furnitureMap.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();
        for (Chair value : furnitureMap.values()){
            System.out.print(value.getWidth() +", " + value.getHeight() + ";  ");
        }
        System.out.println();
        System.out.println();
        for (Map.Entry<Integer, Chair> entry : furnitureMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().toString() + " ;");
            // ???????
        }
    }
}
