package main.java.tasks.day3;

public class Day3Runner {
    public static void main(String[] args) {
        System.out.println("Задача: найти сумму элементов целочисленного массива, которые кратны числу текущего месяца");
        ReturnArray returnArray = new ReturnArray();
        returnArray.arrayMonth();
        System.out.println("Задача: найти сумму каждого n-ого элемента в целочисленном массиве");
        new SumOfElements().sum(2);
        System.out.println("Задача: вывести новый целочисленный массив в обратном порядке");
        new ReturnIntArray().intArray(10);
        System.out.println("Задача: вывести в консоль рисунок из символов");
    }
}
