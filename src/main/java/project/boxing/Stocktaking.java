package main.java.project.boxing;

import java.io.*;

////- Создать класс Stocktaking, который записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
////- Прочитать файл полученный в предыдущем пункте, получить обьекты VesselBox и вывести в консоль тип хранимых данных и их количество.

public class Stocktaking {

    public void writeInfo(String objectInformation) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(objectInformation));
        //out.write(objectNames);
        out.close();
    }

    public void readInfo(String objectInformation) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(objectInformation));
        String objectNames;

        while ((objectNames = in.readLine()) != null) {

        }
    }
}
