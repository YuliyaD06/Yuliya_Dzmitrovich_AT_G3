package main.java.tasks.day5;

import java.io.IOException;

public class RunnerForTextFile {

    public static void main(String[] args) throws IOException, IOException {

        WorkWithTextFile textFile = new WorkWithTextFile();

        textFile.write(textFile.fileName);
        textFile.readWordsAndSymbols(textFile.fileName);

    }
}
