package Mang;

import java.util.Scanner;

public class removeArr {
    public static void main(String[] args) {
        int[] arr = {13, 2, 3, 43, 54, 6, 7};
        removeArr(arr);
    }
    public static void removeArr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị cần xóa : ");
        int value = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                i = i + 1;
            }
            System.out.print(arr[i] + " ");
        }
    }


}
