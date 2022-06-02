package demo_interface;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(6,3);
        shapes[2] = new Square(3);
        Random random = new Random();
        double randomValue = 50; // random.nextDouble()*(100-1)+1
        for (Shape shape : shapes){
            System.out.println("Before : " + shape.area());
            if(shape instanceof Resizeable){
                ((Resizeable) shape).resize(Math.random()*100 + 1);
            }
            System.out.println("Area after : " + shape.area());
        }
    }
}