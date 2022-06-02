package OOP;

import java.util.Scanner;

public class PTbac2 {
    // pt bac 2 : Ax + bx + c = 0
    private double a,b,c,delta,r1,r2;
    PTbac2(double a, double b, double c){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        this.a = sc.nextDouble();
        System.out.print("Nhập b : ");
        this.b = sc.nextDouble();
        System.out.print("Nhập b : ");
        this.c = sc.nextDouble();
    }
    double gettera(){
        return a;
    }
    double getterb(){
        return b;
    }
    double getterc(){
        return c;
    }
    double getRoot1(){
        return r1 = (-b + Math.sqrt((b*b-4*a*c)))/(2*a);
    }
    double getRoot2(){
        return r2 = (-b - Math.sqrt((b*b-4*a*c)))/(2*a);
    }
    double getDelta(){
        return delta = b*2 - 4*a*c;
    }
    double getNghiemkep(){
        return (-b/(2*a));
    }
    void show(double delta){
        System.out.println("delta có giá trị là " + delta);
        if(delta > 0){
            System.out.println("Nghiệm một là " + getRoot1());
            System.out.println("Nghiệm hai là " + getRoot2());
        }else if (delta == 0){
            System.out.println("Phương trình có nghiệm kép : " + getNghiemkep());
        } else {
            System.out.println("Phương trình vô ngiệm");

        }
    }

    public static void main(String[] args) {
        PTbac2 ptbac2 = new PTbac2(1,3,1);
        ptbac2.show(ptbac2.getDelta());
//        System.out.println(ptbac2.gettera());
//        System.out.println(ptbac2.getterb());
//        System.out.println(ptbac2.getterc());
    }
}
