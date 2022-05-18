package Loop;

import java.util.Scanner;

public class uocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a : ");
        int a = Math.abs(sc.nextInt());
        System.out.print("Nhập giá trị b : ");
        int b = Math.abs(sc.nextInt());

        while (a != b) {
            if (a == 0 || b == 0) {
                System.out.println("Không có ước chung");
                return;
            }
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("Ước lớn nhất là " + a);

    }
}
