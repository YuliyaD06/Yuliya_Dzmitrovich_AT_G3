package main.java.tasks.day1;

public class DemoMain {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result = calc.add(2, 3);

        if (result == 5) {
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }


    }
}
