package OOP.doiTuongHinhHoc;

public class Square extends Rectangle{
    Square(){

    }
    Square(double side){
        super(side,side);
    }

    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }


    // tao phuong thuc

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width){
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString(){
        return "A Square with side = " + getSide() +
                ", which is a subclass of " + super.toString();
    }

    @Override
    public double getArea(){
        return Math.pow(getSide(),2);
    }

    @Override
    public double getPerimeter(){
        return 4 * getSide();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

         square = new Square(2.3);
        System.out.println(square);

         square = new Square(4,"yellow",false);
        System.out.println(square);
        System.out.println(square.getArea());
    }
}
