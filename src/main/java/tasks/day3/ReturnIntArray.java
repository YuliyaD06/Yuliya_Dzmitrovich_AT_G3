/*написать метод, который вернет целочисленный массив, состоящий только из тех элементов исходного
целочисленного массива, которые больше, чем число n, где n - целое число, передаваемое в сигнатуру
этого метода, элементы в результирующем массиве должны быть расположены в обратном порядке*/
package main.java.tasks.day3;
import java.util.Random;
public class ReturnIntArray {
    public void intArray(int n) {
        int[] arrayInt = new int[5];
        Random random = new Random();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i] = random.nextInt(20));
        }
        int[] arrayUpdated = new int[5];
        int counter = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > n) {
                arrayUpdated[counter++] = arrayInt[i];
            }
        }
        int[] fine = new int[counter];
        System.out.println("Выбранный массив: " );
        for (int i = 0; i < counter ; i++){
            fine [i]= arrayUpdated[i];
            System.out.println(fine[i]);
        }
        System.out.println("Выбранный массив в обратном порядке: ");
        for (int i = fine.length - 1; i >= 0; i--) {
            System.out.println(fine[i]);
        }
    }
}
