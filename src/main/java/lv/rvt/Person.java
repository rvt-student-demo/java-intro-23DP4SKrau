package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    // Constructor to initialize the Person object
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Getter for the weight
    public int getWeight() {
        return weight;
    }

    // Getter for the name
    public String getName() {
        return name;
    }
    
}
