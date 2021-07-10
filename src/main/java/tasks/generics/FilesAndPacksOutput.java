package main.java.tasks.generics;
//- Вывести список файлов и папок выбранного места на диске.

import java.io.File;

public class FilesAndPacksOutput {

    public static void main(String[] args) {

        File folderPath = new File("/Users/Yuliya_Dzmitrovich/IdeaProjects/Test_Project/src/main/java/TEST_JSON_Collection");
        for (File files: folderPath.listFiles()){
            System.out.println(files.getName());
        }

    }

}
