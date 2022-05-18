package OOP;

import java.util.Arrays;

public class testOOP {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 5, 0, 2, 2};
        for (int i = 0; i < arr.length; i++){
            int temp = arr[0]; // 5
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


//        for (int i = 0; i < arr.length; i++) {
//            int j = i;
//            while (j > 0 && arr[j - 1] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                    j = j - 1;
//            }
//        }
//                System.out.println(Arrays.toString(arr));

    }
}
