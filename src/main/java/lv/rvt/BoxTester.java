package lv.rvt;

public class BoxTester {
    public static void main(String[] args) {
        Box box1 = new Box(2.5, 5.0, 6.0);
        System.out.println("Area: " + box1.area() + " Volume: " + box1.volume());

        Box box2 = new Box(box1);
        System.out.println("Box 2 (copy of Box 1) Area: " + box2.area());

        Box bigger = box1.biggerBox();
        Box smaller = box1.smallerBox();
        System.out.println("Bigger Box Area: " + bigger.area());
        System.out.println("Smaller Box Area: " + smaller.area());
    }
}