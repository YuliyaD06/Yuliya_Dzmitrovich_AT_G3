package main.java.tasks.lambda;

public class Person {

    public String name;
    public String surname;
    public int age; //ThreadLocalRandom.current().nextInt(15, 35+1)



    @Override
    public String toString() {
        return "Person: " +
                "name '" + name + '\'' +
                ", surname '" + surname + '\'' +
                ", age '" + age + '\'' +
                '.';
    }

//    public Person() {
//        name = ;
//        surname = ;
//        age = ;
//    }
}
