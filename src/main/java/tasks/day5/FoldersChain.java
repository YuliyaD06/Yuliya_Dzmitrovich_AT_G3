package main.java.tasks.day5;
//- Создать цепочку из 4-х вложенных папок, в самой глубокой создать 2 произвольных текстовых файла,
// заполнить их 10 произвольными целыми числами.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FoldersChain {

    String fileName = "/pack1/pack2/pack3/pack4/TextFile1.txt";
    // ?????

    public void write(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.write(newNumbers());
        out.close();
    }

    public String newNumbers(){
        int[] randomNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i] = random.nextInt(150));
        }
        return randomNumbers.toString();
    }

    public static void main(String[] args) throws IOException {
        FoldersChain chain = new FoldersChain();
        chain.write(chain.fileName);
    }

}
