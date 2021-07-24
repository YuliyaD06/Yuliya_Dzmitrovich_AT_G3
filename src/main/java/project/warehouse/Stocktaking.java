package main.java.project.warehouse;

import java.io.*;
import java.nio.file.Path;

////- Создать класс Stocktaking, который записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
////- Прочитать файл полученный в предыдущем пункте, получить обьекты VesselBox и вывести в консоль тип
// хранимых данных и их количество.
//---- public static registerBox(VesselBox box) - записывает информацию в файл
//---- public static disposeBox(VesselBox box) - убирает запись
//---- private static final Path FILE - путь к файлу для записи
//---- public static void getInfo() - печатает в консоль информацию о состоянии склада
//-- информация о каждом новом ящике записывается в виде новой строки в формате #hashCode#name
public class Stocktaking {

    private static final Path FILE = Path.of("/Users/Yuliya_Dzmitrovich/IdeaProjects" +
            "/Test_Project/src/main/java/project/warehouse/Info.txt");

    public static void registerBox(VesselBox box)  {

/*        try (FileOutputStream fos = new FileOutputStream(String.valueOf(FILE))){
            fos.write();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }*/

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(String.valueOf(FILE)));
            while (box.toString() != null) {
                out.write(box.toString());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void getInfo() throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader(String.valueOf(FILE.toFile())));

    }

    public static  void disposeBox(VesselBox box) throws IOException {
       //вычитка строк в другой файл -> удаление старого -> переименование нового текст файла ????
            //BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(FILE.toFile()));
            //BufferedWriter out = new BufferedWriter(new FileWriter(String.valueOf(FILE.toFile()));
  
            /*while((reader.readLine()) != null){

            }*/

    }


}
