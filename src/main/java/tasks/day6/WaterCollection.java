package main.java.tasks.day6;

import java.util.Arrays;
import java.util.List;

//Создать список воды water из 3 обьектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный)
// соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки
public class WaterCollection {
    public static void main(String[] args) {

        Water11[] water = {new Water11("Прозрачная", "Нет"), new Water11("Прозрачная", "Нет"), new Water11("Мутная", "Аммиачная")};
        List<Water11> waterList = Arrays.asList(water);
        for (Water11 water11 : waterList){
            System.out.println(water11.getColor() + "-" + water11.isSmell());
        }
    }

}
