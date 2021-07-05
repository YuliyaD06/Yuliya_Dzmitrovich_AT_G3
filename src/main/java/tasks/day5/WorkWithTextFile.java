package main.java.tasks.day5;

//- Прочитать текстовый файл, подсчитать в тексте количество знаков препинания и слов и вывести результат в консоль.
// "?!:;,."

import java.io.*;
import java.util.Arrays;

public class WorkWithTextFile {

    String text = "Seasons from, air fruit saying saw our great.) In were them? Fifth herb second unto was gathering spirit very.";
    String fileName = "TestText.txt";


    public void write(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.write(text);
        out.close();
    }

    public void readWordsAndSymbols(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String text;

        while ((text = in.readLine()) != null) {
            String[] textArray = text.split("\\s");
            System.out.println("The number of words in the text = " + textArray.length + ".");
            System.out.println(text.length());
            String textWithoutSymbols = text.replaceAll("[.,;?:) !]", "");
            System.out.println("The number of symbols = " + textWithoutSymbols.length() + ".");
            System.out.println("The number of words and symbols = " + (textArray.length + textWithoutSymbols.length()) + ".");
        }
        in.close();
    }
}