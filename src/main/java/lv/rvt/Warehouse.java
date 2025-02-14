package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity < 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
        this.balance = 0;
    }
    
    public double getBalance() {
        return this.balance;
    }
    public double getCapcity() {
        return this.capacity;
    }

public double howMuchSpaceLeft() {
    return this.capacity - this.balance;
    };
    
}