package OOP.doiTuongHinhHoc;

public class Shape {
    public String color;
    boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public boolean isFilled(boolean filled){
        return filled;
    }

    @Override
    public String toString(){
        return "A Shape with color = " + getColor()
                + " and filled = " +
                ((isFilled(filled))? "filled" : "not filled");

    }

//    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red",false);
//        System.out.println(shape);
//    }
}
