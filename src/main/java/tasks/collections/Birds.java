package main.java.tasks.collections;
/*Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
        Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        Проитерировать список по индексу и отпечатать слова в консоль через пробел
        Заменить 3-й элемент списка на Синица
        Проитерировать список через for-each и отпечатать слова в консоль через пробел*/

import java.util.Arrays;
import java.util.List;
//использовать регулярку

public class Birds {
    public static void main(String[] args) {
        List<String> birdsList = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        int counter = 0;

        for (String bird : birdsList) {
            System.out.println("--" + bird + "--");
        }

        for (String bird : birdsList){
            if ((bird.split("[АОУЭИЫЕЁЯЮаоуэиыеёяю]")).length > 1){
                counter++;
            }
        }
        System.out.println(counter);

        for (int bird = 0; bird < birdsList.size(); bird++) {
            System.out.print(birdsList.get(bird) + " ");
        }
        System.out.println();
        birdsList.set(3, "Синица");
        for (String bird : birdsList) {
            System.out.println(bird + " ");
        }

    }

}
