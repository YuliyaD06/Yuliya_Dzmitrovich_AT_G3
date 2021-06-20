package main.java.tasks.day2;
// используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
public class TaskFor {
    static void printOddNumber(){
        for (int a = 3; a<20; a++){
            if ( a%2 != 0){
                System.out.print(a + " ");
            }
        }
    }
}
