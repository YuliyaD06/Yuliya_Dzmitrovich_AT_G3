package main.java.project.warehouse;

import main.java.project.vessel.Vessel;

import java.util.HashMap;
import java.util.Map;

//- Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
//---- private Map<Integer, VesselBox> stock, которая является хранилищем ящиков
//---- public void addBox(VesselBox box) - для добавления ящиков в хранилище
//---- VesselBox getBox() - для получения содержимого ящиков
//---- void removeBox() - для удаления ящиков
//---- при добавлении/удалении ящиков Stocktaking обновляет информацию о состоянии склада

public class Warehouse {

    private Map<Integer, VesselBox> stock = new HashMap<>();
    private int stockSize;

    public void addBox(VesselBox box){

        box = new VesselBox(box.getName(), box.getBox());

        if (stockSize < stock.size()) {
            for (int i = 0; i < stock.size(); i++){
                stock.put(i, box); // ????????
                stockSize++;
            }
        }

    }

/*    VesselBox getBox(){

    }*/

    public void removeBox(){
        if (stockSize > 0) {
            stock.remove(1);
            stockSize--;
        }
    }

}
