package Mang;

import java.util.Locale;
import java.util.Scanner;

public class timCharTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "toidihoc".toLowerCase();
        String input = sc.nextLine().toLowerCase();
        char kiTu = input.charAt(0);
        int count = 0;
        if(input.length() != 1){
            System.out.println("Số này quá dài ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kiTu) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("xuat hien " + count + " lan ");
    }
}
