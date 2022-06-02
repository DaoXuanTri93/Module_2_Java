package OOP.doiTuongHinhHoc;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    Rectangle(){

    }

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;

    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    // tao phuong thuc
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

//    @Override
//    public void setColor(String color) {
//        super.setColor(color);
//    }
//
//    @Override
//    public String getColor() {
//        return super.getColor();
//    }

    public double getArea(){
        return width * this.length;
    }

    public double getPerimeter(){
        return (width + this.length) * 2 ;
    }
    @Override
    public String toString(){
        return "A Rectangle with = " + getWidth() +
                " and length = " + getLength() +
                ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5,3.8,"white",false);
        System.out.println(rectangle);
    }

}
