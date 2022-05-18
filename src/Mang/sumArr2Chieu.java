package Mang;

import java.util.Scanner;

public class sumArr2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("Nhập số dòng của mảng : ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột của mảng : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("nhập giá trị trong mảng " + j + " là : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Nhập số dòng cần tính tổng : ");
        int number = sc.nextInt();
        for(int i = 0; i < row; i++){
            for (int j = 0 ; j < col; j++){
                if (arr[i][j] == arr[number][j]){
                    total += arr[number][j];
                }
            }
        }
        System.out.println("Tổng của số dòng " + number + " là : " + total);
    }
}
