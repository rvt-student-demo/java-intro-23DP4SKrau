package lv.rvt;

public class Box {
    private double width, height, length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this(side, side, side);
    }

    public Box(Box other) {
        this(other.width, other.height, other.length);
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * (width * height + height * length + length * width);
    }

    public Box biggerBox() {
        return new Box(width * 1.25, height * 1.25, length * 1.25);
    }

    public Box smallerBox() {
        return new Box(width * 0.75, height * 0.75, length * 0.75);
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getLength() { return length; }
}
