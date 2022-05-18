package Mang;

import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static double fahrenheit(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsius(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        int check = -1;
        while (check != 0) {
            System.out.println("1. chuyen doi C -> F");
            System.out.println("2. chuyen doi F -> C");
            System.out.println("3. thoat");
            System.out.print("Nhap so can thao tac : ");
            check = sc.nextInt();
            switch (check) {
                case 1:
                    System.out.print("nhap nhiet do C");
                    celsius = sc.nextDouble();
                    fahrenheit = celsius(celsius);
                    System.out.print("Day la nhiet do F : " + fahrenheit);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("nhap nhiet do F");
                    fahrenheit = sc.nextDouble();
                    celsius = fahrenheit(fahrenheit);
                    System.out.print("Day la nhiet do C : " + celsius);
                    System.out.println();
                    break;
                case 3: System.exit(0);
            }
        }
    }
}
