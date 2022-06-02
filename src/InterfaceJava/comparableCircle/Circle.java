package InterfaceJava.comparableCircle;

public abstract class Circle {
    private double radius = 2;
    private String color = "yellow";
    private boolean filled = true;

    Circle(){

    }
    Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return radius;
    }
//    public abstract double getArea();
//    public abstract double getPerimeter();


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
