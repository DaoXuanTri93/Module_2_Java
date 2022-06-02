package OOP;

import java.util.Scanner;

public class Student {
    private String ten, lop;
    private double toan, ly, hoa,diemTB;
    public void nhapSoDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten ");
        ten = sc.nextLine();
        System.out.print("nhap ten lop ");
        lop = sc.nextLine();
        System.out.print("Nhap diem toan ");
        toan = sc.nextDouble();
        System.out.print("Nhap diem ly ");
        ly = sc.nextDouble();
        System.out.print("Nhap diem hoa ");
        hoa = sc.nextDouble();
    }
    public String layTen(){

        return ten;
    }
    public String lop(){

        return lop;
    }
    public double diemTrungBinh(double toan, double ly, double hoa) {
        diemTB = (toan+ly+hoa)/3;
        return diemTB;
    }

    public String xepLoaiHocLuc(double diemTB){
        if(diemTB >= 0 && diemTB <= 5){
            return "hoc yeu";
        } else if (diemTB <= 10 && diemTB >5){
            return "hoc tot";
        }
        return "so diem khong hop le";
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.nhapSoDiem();
        System.out.println("ten cua ban : " + student.layTen());
        System.out.println("ten cua ban : " + student.lop());
        System.out.println("diem trung binh = " + student.diemTrungBinh(student.toan,student.ly,student.hoa));
        System.out.println("xep loai = " + student.xepLoaiHocLuc(student.diemTrungBinh(student.toan,student.ly,student.hoa)));
    }
}
