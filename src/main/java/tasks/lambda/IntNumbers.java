package main.java.tasks.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

////- сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue и определить,
// содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream
public class IntNumbers {
    int minValue;
    int maxValue;

    public static void main(String[] args) {
/*        IntNumbers numbers = new IntNumbers();
        numbers.setMaxValue(60);
        numbers.setMinValue(5);
        List<Integer> numbersList = new ArrayList<Integer>(10);
        for (int i = 0; i < numbersList.size(); i++){
            int randomValue = numbers.getMinValue() + (int) (Math.random() * numbers.getMaxValue()) ;
            numbersList.set(i, randomValue);
            System.out.println(numbersList.get(i));
        }
        for (Integer number : numbersList){
            System.out.print(number + " ");
        }*/

/*        List<Integer> numbersList = Arrays.asList(2, 4, 5, 8, 14, 15, 21, 24);

        int a = numbersList.stream().map(x -> x % 3 == 0 && x % 5 == 0 ? x : 0).filter(x -> x>0).findAny().get();
        System.out.println(a);*/


        int a = IntStream.rangeClosed(1, 18).boxed().map(x -> x % 3 == 0 && x % 5 == 0 ? x : 0)
                .filter(x -> x>0).findAny().get();
        System.out.println(a);

    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}
