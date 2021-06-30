package main.java.tasks.day5;

//- Прочитать текстовый файл, подсчитать в тексте количество знаков препинания и слов и вывести результат в консоль.
// "?!:;,."
import java.io.*;

public class WorkWithTextFile {

    String text = "Seasons from, air fruit saying saw our great.) In were them? Fifth herb second unto was gathering spirit very.";
    String fileName = "TestText.txt";

    char[] symbols = {',', '.', ':', '?', ')'};
    int counter = 0;


    public void write(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.write(text);
        out.close();
    }

    public void readWords(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String text;

        while ((text = in.readLine()) != null) {
            String[] textArray = text.split("\\s");
            System.out.println("The number of words in the text = " + textArray.length + ".");
            in.close();
        }
    }
}
    /*    public void findSymbols() {
            char[] characters = text.toCharArray();
            char[] asFinal = new char[characters.length];

            for (char f : asFinal) {
                for (int i = 0; i < characters.length; i++) {
                    for (int e = 0; e < symbols.length; e++) {
                        if (String.valueOf(characters[i]).equals(e)) {
                            asFinal[f] = characters[i];
                        }
                    }
                }
                System.out.println(asFinal.length);
            }*/

/*        for (char f : asFinal){
            System.out.println(asFinal.length);
        }*/



/* ONLY for READTEXT
    Exception in thread "main" java.io.IOException: Stream closed
        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:319)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:392)
        at main.java.tasks.day5.WorkWithTextFile.readWords(WorkWithTextFile.java:32)
        at main.java.tasks.day5.Day5Runner.main(Day5Runner.java:12)*/

/*    public void readSymbols(String fileName) throws IOException {
        BufferedReader inNew = new BufferedReader(new FileReader(fileName));
        characters = text.toCharArray();

        while ((text = inNew.readLine()) != null) {
            String[] symbolsArray = text.split(",");

            System.out.println("The number of symbols in the text = " );
            inNew.close();
        }
    }*/