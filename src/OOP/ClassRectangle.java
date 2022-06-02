package OOP;

import java.util.Scanner;

public class ClassRectangle {
    // khai bao cac thuoc tinh property
    double width;
    double height;
    // dinh nghia cac phuong thuc khoi tao (goi la Contructor)
    public ClassRectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    // dinh nghia cac phuong thuc getArea() (tinh dien tich)
    // getPerimeter() (tinh chu vi)
    // display() ( hien thi hinh chu nhat)
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String  display(){
        return "show display";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap width: ");
        double width = sc.nextDouble();
        System.out.println("nhap height: ");
        double height = sc.nextDouble();
        ClassRectangle hcn = new ClassRectangle(width,height);
        System.out.println("dien tich " + hcn.getArea());
        System.out.println("chu vi " + hcn.getPerimeter());
        System.out.println(hcn.display());
    }
}
