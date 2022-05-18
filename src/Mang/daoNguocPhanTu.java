package Mang;

import java.util.Scanner;

public class daoNguocPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] numbers;
//        numbers = new int[]{1,2,3,4,5,6,7};
        int phanTu = sc.nextInt();
        int[] numbers;
        numbers = new int[phanTu];
        int k = 0;
        while(k < numbers.length){
            System.out.println("nhap phan tu thu " + (k + 1)  );
            numbers[k] = sc.nextInt();
            k++;
        }
        int i = 0;
        int j = numbers.length-1;
        int temp = 0;
        while(i < j){
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
        System.out.println("mảng đảo ngược là : ");
        for (int item : numbers){
            System.out.print(item + " ");
        }

    }
}
