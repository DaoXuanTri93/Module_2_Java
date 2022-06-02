package OOP.lopPoint2D_3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    Point3D(){

    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {super.getX(),super.getY(),z};
        return arr;
    }

    @Override
    public String toString() {
        return  super.toString() + "Point3D{" + "z =" + getZ() + "}" ;
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1.0f,2.0f,3.0f);
        System.out.println(point3D);

        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        System.out.println(Arrays.toString(point3D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
