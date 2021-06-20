package main.java.tasks.day2;
import java.util.Random;
// найти минимальный элемент массива и вывести результат в консоль
// ??????????????????????

public class MinElement {
    static void toFindMin() {
        int[] array8 = new int[3];
        Random random = new Random();
        System.out.println("исходный массив: ");
        for (int l = 0; l < array8.length; l++) {
            System.out.println(array8[l] = random.nextInt(15));
        }
        int minValue = array8[0];
        for(int l = 0; l < array8.length; l++){
            if (array8[l] < minValue){
                minValue = array8[l];
            }
        }
        System.out.println("Минимальное значение: " + minValue);

    }
}
