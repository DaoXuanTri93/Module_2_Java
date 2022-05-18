package Mang;

import java.util.Scanner;

public class mang2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col = 3;
        int arr[][] = new int[row][col]; // mảng 1 là dòng, mảng 2 là cột
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("nhap element thu " + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("mang dc them vao :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println(arr[0][arr[0].length-1]);
    }
}