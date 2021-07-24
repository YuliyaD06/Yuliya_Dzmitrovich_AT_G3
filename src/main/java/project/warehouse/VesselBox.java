package main.java.project.warehouse;
//- Создать класс параметризованного типа (Generic) VesselBox, который может хранить
// в себе массив из 9, 25 или 36 элементов наследуемых от класса абстрактного класа Vessel.
//- Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
//- Создать класс Stocktaking, который записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
//- Прочитать файл полученный в предыдущем пункте, получить обьекты VesselBox и вывести в консоль тип хранимых данных и их количество.

//---- private String name - имя ящика, по маске "I am box with <25> <Bottles>"
//---- private int capacity - вместимость ящика
//---- private List<Containable> box - коллекция обьектов типа Containable
//---- private long id - уникальный ID для каждого нового обьекта, имеет геттер, но не сеттера, инициализируются в конструкторе
//++?? public boolean equals(Object o) - переписанный метод equals
//++?? public int hashCode() - переписанный метод hashCode, причем у каждого нового ящика он должен быть уникальным
//---- public VesselBox(String name, List<Containable> box) - конструктор, где инициализируются все 3 переменные
//---- на все есть геттеры (но нет сеттеров)

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Containable;
import main.java.project.vessel.Vessel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VesselBox<T extends Vessel> {

    private String name = "I am box with <n> <Bottles>";

    private int capacity;
    private List<Containable> box = new ArrayList<>();
    private long id;


    public VesselBox(String name, List<Containable> box) {
        // Bubble[] bubbles = new Bubble[(int)(10000 * volume)];
        //        List<Bubble> bubble = Arrays.asList(bubbles);
        //        for (int i = 0; i < bubble.size(); i++) {
        //            bubble.set(i, new Bubble("gas"));
        //        }
        this.name = name;
        this.box = box;

        capacity = box.size();
        for (int i = 0; i < box.size(); i++) {
            //box.set(i, new <Containable>);
        }

        for (int i = 1; i < box.size() + 1; i++) {
            id = i;
        }

        Pattern p = Pattern.compile("<(\\d+)>");
        Matcher m = p.matcher(name);
        int[] n = new int[]{9, 25, 36};
        StringBuffer result = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(result, String.valueOf(n[Integer.parseInt(m.group(1)) - 1]));
        }
        m.appendTail(result);
        System.out.println(result.toString());

    }


    //VARIANT 2
/*    private HashMap<Integer, Containable> values = new HashMap<>();
    Pattern p = Pattern.compile("%(\\\\w+)%");
    Matcher m = p.matcher("I am box with < %capacity% > < %Containable% >");
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
        m.appendReplacement(sb, String.valueOf(values.get(m.group(1))));
    }
    m.appendTail(sb);*/


    public VesselBox(long id) {
        this.id = id;
    }

    public int hashCode() {
        return Objects.hashCode(box);
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        VesselBox  vesselBox = (VesselBox) o;
        return name == vesselBox.getName() && capacity == vesselBox.getCapacity();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    @Override
    public String toString() {
        return "id: " + id + "VesselBox \"" + name + "\".";
    }
}

/*        this.capacity = size;
        if (size == 9){
            T[] smallBox = (T[]) new Vessel[9];
        } else if (size == 25){
            T[] mediumBox = (T[]) new Vessel[25];
        } else {
            T[] largeBox = (T[]) new Vessel[36];
        }*/
