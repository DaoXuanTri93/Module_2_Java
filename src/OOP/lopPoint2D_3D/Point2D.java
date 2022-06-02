package OOP.lopPoint2D_3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    Point2D(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = {getX(),getY()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1.0f,2.0f);
        System.out.println(point2D);

        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
//        System.out.println(Arrays.toString(point2D.getXY()));

        float[] arrNew = point2D.getXY();
        System.out.println("mang XY : ");
        for (float value : arrNew){
            System.out.println(value);
        }
    }
}
