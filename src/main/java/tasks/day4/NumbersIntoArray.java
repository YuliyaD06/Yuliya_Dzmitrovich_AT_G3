package main.java.tasks.day4;

// найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль
public class NumbersIntoArray {

    public static void main(String[] args) {

        String textTest = "te23st; mes3'sage f45or dup23lica";
        String[] array = textTest.split("\\D+");

        int[] intArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != "") {
                intArray[i] = Integer.parseInt(array[i]);
                System.out.println(intArray[i]);
            }
        }

    }
}

