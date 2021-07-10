package main.java.tasks.generics;
//- Создать цепочку из 4-х вложенных папок, в самой глубокой создать 2 произвольных текстовых файла,
// заполнить их 10 произвольными целыми числами.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FoldersChain {

    public void write(File fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.write(String.valueOf(newNumbers()));
        out.close();
    }

    public int[] newNumbers(){
        int[] randomNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print((randomNumbers[i] = random.nextInt(150)) + " ");
        }
        return randomNumbers;
    }

    public static void main(String[] args) throws IOException {

        String file1 = "/Users/Yuliya_Dzmitrovich/IdeaProjects/Test_Project/src/main/java/pack1/pack2/pack3/pack4/TextFile1.txt";
        String file2 = "/Users/Yuliya_Dzmitrovich/IdeaProjects/Test_Project/src/main/java/pack1/pack2/pack3/pack4/TextFile2.txt";

        Path path = Paths.get("/Users/Yuliya_Dzmitrovich/IdeaProjects/Test_Project/src/main/java/pack1/pack2/pack3/pack4");

        Files.createDirectories(path);

        File newFile1 = new File(file1);
        System.out.println("File 1: ");
        new FoldersChain().write(newFile1);
        System.out.println();
        File newFile2 = new File(file2);
        System.out.println("File 2: ");
        new FoldersChain().write(newFile2);


    }

}
