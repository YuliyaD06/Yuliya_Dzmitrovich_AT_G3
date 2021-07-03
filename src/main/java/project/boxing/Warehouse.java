package main.java.project.boxing;
//- Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
public class Warehouse {

    GenericVesselBox<Bottle> bottleBox = new GenericVesselBox<>();
    GenericVesselBox<Cup> cupBox = new GenericVesselBox<>();

    String nameBox;
    String nameCup;

    public Warehouse(String nameBox, String nameCup) {
        this.nameBox = nameBox;
        this.nameCup = nameCup;
        this.bottleBox = bottleBox;
        this.cupBox = cupBox;
    }


    public void objectsName(){
        System.out.println("The stored object names are " + nameBox + ", "  + nameCup);
    }

}
