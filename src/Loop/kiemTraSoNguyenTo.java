package Loop;

import java.util.Scanner;

public class kiemTraSoNguyenTo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        System.out.print("Nhập a để kiểm tra SNT : ");
////        int a = sc.nextInt();
////            if(a < 2){
////                System.out.println("day la SNT");
////            }else {
////                for (int i = 2; i < Math.sqrt(a); i++) {
////                    if(a % i == 0){
////                        System.out.println("day ko phai la SNT");
////                        break;
////                    } else {
////                        System.out.println("day la SNT");
////                    }
////                }
////            }
        int a = 6;
        if(a < 2){
            System.out.println("day ko fai la SNT");
        } else {
            int i = 2;
            boolean flag = true;
            while(i < a){
                if(a % i == 0){
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag){
                System.out.println("Đây là SNT");
            } else {
                System.out.println("Đây ko phải là SNT");
            }
        }

    }
}
