package Mang;

import java.util.Arrays;

public class addArrrr {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int x = 10;
        int index = 1;
        int[] temp = new int[4];
        for (int i = 0; i < temp.length; i++){
            if(i < index){
                temp[i] = arr[i];
            } else if(i == index){
                temp[i] = x;
            } else {
                temp[i] = arr[i-1];
            }
        }
  
        System.out.println(Arrays.toString(temp));
    }
}

