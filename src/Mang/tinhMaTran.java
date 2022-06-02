package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class tinhMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("Nhập giá trị phần tử thứ " + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng sau khi thêm : ");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println();
        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j  < col; j++){
                if(i == j){
                    total += arr[i][j];
                }
            }
        }
        System.out.println("day la total " + total);
    }
}
