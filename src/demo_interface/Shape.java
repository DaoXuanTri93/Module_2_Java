package demo_interface;

public abstract class Shape{
    private String color;

    protected Shape() {
    }

    public abstract double area();
    public abstract double perimeter();
}
