package main.java.tasks.day6;

import java.util.Arrays;
import java.util.List;

//Создать список воды water из 3 обьектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный)
// соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки
public class WaterCollection {
    public static void main(String[] args) {

        WaterNew[] water = {new WaterNew("Прозрачная", "Нет"), new WaterNew("Прозрачная", "Нет"), new WaterNew("Мутная", "Аммиачная")};
        List<WaterNew> waterList = Arrays.asList(water);
        for (WaterNew water11 : waterList){
            System.out.println(water11.getColor() + "-" + water11.isSmell());
        }
    }

}
