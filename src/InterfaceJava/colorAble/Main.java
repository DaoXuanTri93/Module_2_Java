package InterfaceJava.colorAble;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(6,3);
        shapes[2] = new Square(3);
        for (Shape shape : shapes){
            System.out.println("This is Area: " + shape.area());
            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }
    }
}