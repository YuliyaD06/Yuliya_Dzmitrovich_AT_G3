package main.java.project.boxing;

import java.io.*;

////- Создать класс Stocktaking, который записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
////- Прочитать файл полученный в предыдущем пункте, получить обьекты VesselBox и вывести в консоль тип хранимых данных и их количество.

public class Stocktaking {

    //на вход vesselbox
    public void writeInfo(String objectNameBottle) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(objectNameBottle));
        //out.write();
        out.close();
    }

    //на вход vesselbox
    public void readInfo(String objectNameBottle) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(objectNameBottle));
        String nameBottleBox;
        String nameCupBox;

        while ((nameBottleBox = in.readLine()) != null) {

        }
    }

    //Stocktaking.registratingbox(box)
}
