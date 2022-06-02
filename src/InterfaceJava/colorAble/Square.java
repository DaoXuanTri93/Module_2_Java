
package InterfaceJava.colorAble;
import InterfaceJava.colorAble.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square(double side){
        super(side,side);
    }
    @Override
    public double area() {
        return Math.pow(super.getWidth(),2);
    }

    @Override
    public double perimeter() {
        return 4 * getWidth();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
