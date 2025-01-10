public class Box {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width= width;
        this.height = height;
    }
    public double area() {
        return 2 * (length * width + width * height + height * length);
    }
    public double volume() {
        return length * width * height;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }

}

public class BoxTester {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);
        System.out.println("Area: " + box.area() + " Volume: " + box.volume());
        System.out.println("Length: " + box.getLength() + " Height: " + box.getHeight() + " Width: " + box.getWidth());
    }
}