package main.java.project.warehouse;

import main.java.project.vessel.Vessel;

//- Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
public class Warehouse {

    VesselBox<Vessel> box1 = new VesselBox<>(25);
    VesselBox<Vessel> box2 = new VesselBox<>(9);

    String nameBox1;
    String nameBox2;

    public void objectNameBottle(String nameBox1){
        this.nameBox1 = nameBox1;
        System.out.println("The stored object name is " + nameBox1 + ". The size of box = ");
    }
    public void objectNameCup(String nameBox2){
        this.nameBox2 = nameBox2;
        System.out.println("The stored object name is " + nameBox2 + ". The size of box = ");
    }


    //void getINFOO


}
