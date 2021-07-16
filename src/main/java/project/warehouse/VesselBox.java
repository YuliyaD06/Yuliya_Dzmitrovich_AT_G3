package main.java.project.warehouse;
//- Создать класс параметризованного типа (Generic) VesselBox, который может хранить
// в себе массив из 9, 25 или 36 элементов наследуемых от класса абстрактного класа Vessel.
//- Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
//- Создать класс Stocktaking, который записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
//- Прочитать файл полученный в предыдущем пункте, получить обьекты VesselBox и вывести в консоль тип хранимых данных и их количество.

import main.java.project.vessel.Vessel;

public class VesselBox<T extends Vessel> {

    private int size;

    public VesselBox(int size) {
        this.size = size;
        if (size == 9){
            T[] smallBox = (T[]) new Vessel[9];
        } else if (size == 25){
            T[] mediumBox = (T[]) new Vessel[25];
        } else {
            T[] largeBox = (T[]) new Vessel[36];
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
