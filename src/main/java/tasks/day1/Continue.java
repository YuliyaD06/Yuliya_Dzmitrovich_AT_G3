package main.java.tasks.day1;

import java.sql.SQLOutput;
import java.util.Random;

public class Continue {

    public static void main(String[] args) {

        foo5();

    }

    static void foo() {
        int i = 23;
        while (i < 28) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
            }
            System.out.println("i is " + i++);
        }
        System.out.println("numbre is " + i);
    }


    static void foo1() {
        int a;
        for (a = 23; a < 28; a++) {
            if (a % 13 == 0) {
                System.out.println("continue!");
                break;
            }
            System.out.println("i is " + a);
        }
        System.out.println("numbre is " + a);
    }


    public static void foo3() {
        int[] array = new int[10];
        int sum = 0;
        int avg;
        Random random = new Random();
        for (int l = 0; l < array.length; l++) {
            System.out.println(array[l] = random.nextInt(100));
        }
        for (int k : array) {
            sum += k;
        }
        avg = sum / array.length;
        System.out.println("Average value is: " + avg);

    }


    public static void foo4() {
        int[] array = new int[10];
        int sum = 0;
        int avg;
        Random random = new Random();
        for (int l = 0; l < array.length; l++) {
            array[l] = random.nextInt(100);
        }
        System.out.print("Initial array: ");
        int count = 0;
        for (int m : array) {
            System.out.println("Element" + ++count + " is " + m);
        }
        System.out.println();
        for (int k : array) {
            sum += k;
        }
        avg = sum / array.length;
        System.out.println("Average value is: " + avg);
    }

    public static void foo5() {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("{ ");
        int outerCounter = 0;
        for (int[] s : array) {
            if (outerCounter == 0) {
                System.out.print("{");
            } else {
                System.out.print("  {");
            }
            //{1,2,3}
            int innerCounter = 0;
            for (int e : s) {
                if (innerCounter++ < s.length - 1) { //чтобы не печатать последний элемент, то s.length-1; counter++ - сразу берет counter=0, в след раз +1
                    System.out.print(e + ", ");
                } else {
                    System.out.print(e); //печатаем последний элемент
                }
            }  //innercounter is finished
            //[{}]
            if (outerCounter++ < array.length - 1) {
                System.out.println("},");
            } else {
                System.out.print("}");
            }
        }
        System.out.print("}");
    }


}
