package OOP;

import java.util.Scanner;

public class Square {
    // thuoc tinh class square
   public int canhGocVuong;

    // khoi tao phuong thuc constructor
    public Square(int canhGocVuong){
        this.canhGocVuong = canhGocVuong;
    }
    // khoi tao ham tinh dien tich hinh vuong
    public int getArea(){
        return this.canhGocVuong* this.canhGocVuong;
    }
    //khoi tao ham tinh chu vi hinh vuong
    public int getPerimeter(){
        return this.canhGocVuong*4;
    }
    public String display(){
        return "day la goc vuong : " + canhGocVuong + "\nday la dien tich : " + getArea() + "\nday la chu vi : " + getPerimeter();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Square hinhVuong = new Square(a);
//        System.out.println("day la dien tich " + hinhVuong.getArea());
//        System.out.println("day la chu vi " + hinhVuong.getPerimeter());
        System.out.println(hinhVuong.display());
    }
}
