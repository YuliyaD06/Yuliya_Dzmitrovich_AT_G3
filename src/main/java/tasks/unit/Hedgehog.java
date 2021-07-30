package main.java.tasks.unit;
//- поля:
//private String pattern - содержит паттерн имени ежа формате "Hedgehog <n>", где n - порядковый номер ежа
//private String name - имя ежа в формате "Hedgehog <n>", где n - порядковый номер ежа
//конструктор public Hedgehog(int number) - в нем инициализируется поле name
//метод public void tellMe() - печатает в консоль фразу в формате "I am Hedgehog <n>!",
// где n - порядковый номер eжа и заставляет поток заснуть на 50мс
public class Hedgehog {
    private String pattern = "Hedgehog <%s>";
    private String name;

    public Hedgehog(int number) {
        name = String.format("Hedgehog <%s>", number);
    }

    public void tellMe(){
        System.out.println("I am " + name + "!");
        new Thread(() -> {
            try {
                Thread.currentThread().sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
    }
}
