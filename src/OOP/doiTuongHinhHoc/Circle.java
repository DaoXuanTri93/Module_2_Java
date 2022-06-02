package OOP.doiTuongHinhHoc;

public class Circle extends Shape{
    private double radius = 1.0;

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;

    }

    // method tính diện tích

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    // method tính chu vi

     public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius = " + radius
                + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5,"red",false);
        System.out.println(circle);
    }
}
