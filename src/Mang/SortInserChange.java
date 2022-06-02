package Mang;

import java.util.Arrays;

public class SortInserChange {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 5, 0, 2, 2, -1, -9};
        for (int i = 0; i < arr.length; i++){
//            int temp = arr[0]; // 5
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
