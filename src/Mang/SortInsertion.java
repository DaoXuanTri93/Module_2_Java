package Mang;

import java.util.Arrays;


public class SortInsertion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 5, 0, 2, 2, -1, -9};
//        int temp;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int j = i;
//            while (j > 0 && arr[j - 1] > arr[j]) {
//                 temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//                j--;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        int temp,i,j;
        for (i = 1; i < arr.length; i++){
            temp = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}


