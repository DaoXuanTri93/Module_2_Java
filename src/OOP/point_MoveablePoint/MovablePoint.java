package OOP.point_MoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MovablePoint(float x , float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(){

    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getXSpeed(){
        return xSpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public float getYSpeed(){
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr ={getXSpeed(),getYSpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() + "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint move(){
        super.setX(super.getX() + this.xSpeed) ;
        super.setY(super.getY() + this.ySpeed) ;

        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
//        System.out.println(movablePoint);
//
//        movablePoint = new MovablePoint(1,2,3,4);
//        System.out.println(movablePoint);
//
//        movablePoint = new MovablePoint(5,5);
//        System.out.println(movablePoint);
       /* movablePoint = new MovablePoint(3,3,2,2);
        System.out.println(movablePoint);*/

        movablePoint = new MovablePoint(5,5);
        System.out.println(movablePoint);

//        System.out.println( movablePoint.move());

        float[] arrNew = movablePoint.getSpeed();
        System.out.println(Arrays.toString(arrNew));
    }
}
