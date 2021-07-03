package main.java.project.boxing;
//- Создать класс параметризованного типа (Generic) VesselBox, который может хранить
// в себе массив из 9, 25 или 36 элементов наследуемых от класса абстрактного класа Vessel.
//- Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
//- Создать класс Stocktaking, который записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
//- Прочитать файл полученный в предыдущем пункте, получить обьекты VesselBox и вывести в консоль тип хранимых данных и их количество.

public class GenericVesselBox<T extends Vessel>  {

    public T[] smallBox = (T[]) new Object[9];
    public T[] mediumBox = (T[]) new Object[25];
    public T[] largeBox = (T[]) new Object[36];

    public T[] getSmallBox() {
        return smallBox;
    }

    public void setSmallBox(T[] smallBox) {
        this.smallBox = smallBox;
    }

    public T[] getMediumBox() {
        return mediumBox;
    }

    public void setMediumBox(T[] mediumBox) {
        this.mediumBox = mediumBox;
    }

    public T[] getLargeBox() {
        return largeBox;
    }

    public void setLargeBox(T[] largeBox) {
        this.largeBox = largeBox;
    }
}