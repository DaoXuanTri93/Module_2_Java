package demo_interface;

public class Square extends Rectangle implements Resizeable{
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
    public void resize(double percent) {
        setWidth(getWidth() * (percent / 100));
        setHeight(getWidth());
    }



}
