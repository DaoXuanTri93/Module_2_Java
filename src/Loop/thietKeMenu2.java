package Loop;

import java.util.Scanner;

public class thietKeMenu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 2;
        while(check != 0){
            System.out.println("1. Menu");
            System.out.println("2. danh sach Menu");
            System.out.println("3. thoat");
            System.out.println("Nhap so can thao tac");
            check = sc.nextInt();
            switch (check){
                case 1:
                    int check1 = -1;
                    while(check1 != 0){
                        System.out.println("1. hinh tam giac");
                        System.out.println("2. hinh chu nhat");
                        System.out.println("3. hinh tron");
                        System.out.println("4. Quay lai menu");
                        check1 = sc.nextInt();
                        switch (check1){
                            case 1 : for (int i = 0; i <= 5; i++){
                                System.out.println();
                                for (int j = 0; j <= i ; j++){
                                    System.out.print("*");
                                }
                            }
                                System.out.println();
                            break;
                            case 2: for (int i = 0; i< 3; i++){
                                System.out.println();
                                for (int j = 0; j <= 8; j++){
                                    System.out.print("*");
                                }
                            }
                                System.out.println();
                            break;
                            case 4:
                                System.exit(0);
                        }
                    }
                case 2:
                    System.out.println("day la truong hop 2");
                default:
                    System.out.println("khong co ");
            }
        }
    }
}
