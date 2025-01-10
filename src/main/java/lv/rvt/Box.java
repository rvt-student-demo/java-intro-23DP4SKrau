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
    public staticvoid 
}