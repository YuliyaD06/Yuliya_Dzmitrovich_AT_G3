package main.java.project.boxing;

import java.io.Serializable;

//- Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
public class Warehouse {

    GenericVesselBox<Bottle> bottleBox = new GenericVesselBox<>(25);
    GenericVesselBox<Cup> cupBox = new GenericVesselBox<>(9);

    String nameBottleBox = "Bottle";
    String nameCupBox = "Cup";



    public void objectNameBottle(){
        System.out.println("The stored object name is " + nameBottleBox + ". The size of box = " + getBottleBox().getSize());
    }
    public void objectNameCup(){
        System.out.println("The stored object name is " + nameCupBox + ". The size of box = " + getCupBox().getSize());
    }

    @Override
    public String toString() {
        return "Warehouse consists of " +
                nameBottleBox + '\'' +
                ", " + nameCupBox;
    }

    public GenericVesselBox<Bottle> getBottleBox() {
        return bottleBox;
    }

    public void setBottleBox(GenericVesselBox<Bottle> bottleBox) {
        this.bottleBox = bottleBox;
    }

    public GenericVesselBox<Cup> getCupBox() {
        return cupBox;
    }

    public void setCupBox(GenericVesselBox<Cup> cupBox) {
        this.cupBox = cupBox;
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
