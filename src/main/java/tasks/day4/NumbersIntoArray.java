package main.java.tasks.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль
public class NumbersIntoArray {

    public static void main(String[] args) {

        String textTest = "te23st; mes3'sage f45or dup23lica";

        List<String> textList = Arrays.asList(textTest.split("\\D+"));
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < textList.size(); i++){
            if (textList.get(i) != ""){
                intList.add(Integer.parseInt(textList.get(i)));
                System.out.println();
            }
        }


/*        String[] array = textTest.split("\\D+");

        int[] intArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != "") {
                intArray[i] = Integer.parseInt(array[i]);
                System.out.println(intArray[i]);
            }
        }*/

    }
}

