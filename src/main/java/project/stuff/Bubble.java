package main.java.project.stuff;
/*Bubble:
++ содеждит приватные поля double volume = 03, String gas;
++ содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
++ есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
++ есть публичный метод double getVolume(), возвращающий обьем пузырька
-- public static final double VOLUME = 03
-- public void cramp(), который в консоль выводит слово "Cramp!"*/

public class Bubble {
    private static final double VOLUME = 0.3;
    private String gas;

    public Bubble(String gas){
        getVolume();
        this.gas = gas;
    }

    public static void cramp(){
        System.out.printf("Cramp! ");
    }

    public double getVolume() {
        return VOLUME;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }
}
