package OOP.point_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point(){

    }

    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
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
        return "Point{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(2,3);
        System.out.println(point);

        float[] arrNew = point.getXY();
        for (float value:
            arrNew) {
            System.out.println(value);
        }
    }
}
