package main.java.project.composition;
////++ Bubble:
////++ содеждит приватные поля double volume = 03, String gas;
////++ содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
////++ есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
////++ есть публичный метод double getVolume(), возвращающий обьем пузырька

public class Bubble {
    private double volume;
    private String composition;

    public Bubble(String composition){
        this.volume = 0.3;
        this.composition = composition;
    }

    public static void cramp(){
        System.out.println("Cramp!");
    }
    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    public double getVolume() {
        return volume;
    }

}
