package Mang;

import java.util.Scanner;

public class timGiaTriTrongMang {
    public static void main(String[] args) {
        boolean check = true;
        String[] course;
        course= new String[]{"PHP","JAVA","PYTHON","RUBY","JAVA"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm : ");
        String name = sc.nextLine();
//        System.out.println(name);
        for (int i = 0; i < course.length; i++){
            if(course[i].equals(name)){
                System.out.println("vi tri la " +i);
                check = false;
//                break;
            }
        }
//        System.out.println(check);
        if(check){
            System.out.println("khong co trong danh sach");
        }
    }
}
