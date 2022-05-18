package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class demSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhap size vao day : ");
            size = sc.nextInt();
            if(size > 30){
                System.out.println("size qua dai");
            }
        }while(size > 30);
        int[] arr = new int[size];
        int i = 0;
        while(i < arr.length){
            System.out.print("nhap vi tri thu " + i + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int j = 0; j < arr.length; j++){
            if(arr[j] >= 5 && arr[j] <= 10){
                count++;
            }
        }
        System.out.println("Số lượng thi đỗ là : " + count);
    }
}
