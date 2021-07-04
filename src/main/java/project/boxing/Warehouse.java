package main.java.project.boxing;
//- Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
public class Warehouse {

    GenericVesselBox<Bottle> bottleBox = new GenericVesselBox<>();
    GenericVesselBox<Cup> cupBox = new GenericVesselBox<>();

    String nameBottleBox = "Bottle";
    String nameCupBox = "Cup";

/*    public Warehouse(String nameBottle, String nameCup) {
        this.nameBottleBox = nameBottle;
        this.nameCupBox = nameCup;
    }*/

    public void objectsName(){
        System.out.println("The stored object names are " + nameBottleBox + ", "  + nameCupBox);
    }

    @Override
    public String toString() {
        return "Warehouse consists of " +
                nameBottleBox + '\'' +
                ", " + nameCupBox;
    }

    public String getNameBottleBox() {
        return nameBottleBox;
    }

    public void setNameBottleBox(String nameBottleBox) {
        this.nameBottleBox = nameBottleBox;
    }

    public String getNameCupBox() {
        return nameCupBox;
    }

    public void setNameCupBox(String nameCupBox) {
        this.nameCupBox = nameCupBox;
    }
}
