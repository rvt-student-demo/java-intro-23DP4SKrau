package lv.rvt;

public class Main {
    public static void main(String[] args) {
        // Create a HealthStation object
        HealthStation childrensHospital = new HealthStation();

        // Create two Person objects with sample data
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        // Print out their weights using the weigh method of HealthStation
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
    }
    
}
