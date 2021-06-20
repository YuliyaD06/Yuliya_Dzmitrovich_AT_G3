package main.java.tasks.day2;

public class CycleTaskRunner {

    public static void main(String[] args) {
        TaskArray arrayRandom = new TaskArray();
        ArrayNew arrayNew = new ArrayNew();
        ArrayInSquare arrayInSquare = new ArrayInSquare();
        ChangeElements changeElements = new ChangeElements();

        System.out.println("Sub-task 1");
        new TaskWhile().met1();
        System.out.println();
        System.out.println("Sub-task 2");
        new TaskFor().printOddNumber();
        System.out.println();
        System.out.println("Sub-task 3");
        arrayRandom.arrayRandom();
        System.out.println();
        System.out.println("Sub-task 4");
        new GoThroughArray().printArray();
        System.out.println();
        System.out.println("Sub-task 5");
        new GoThroughArrayInReverse().arrayInReverse();
        System.out.println();
        System.out.println("Sub-task 6");
        arrayNew.multiply();
        System.out.println();
        System.out.println("Sub-task 7");
        arrayInSquare.inSquare();
        System.out.println();
        System.out.println("Sub-task 8");
        new MinElement().toFindMin();
        System.out.println();
        System.out.println("Sub-task 9");
        changeElements.change();
        System.out.println();
        System.out.println("Sub-task 10");
        new Sorting().toSort();

    }
}
