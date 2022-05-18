package Mang;

public class findMinValue {
    public static void main(String[] args) {
        int[][] arr = {
                {-1,1, 2, 3, 4, 5},
                {3, 4, 6},
                {334,21123,4}
        };

        int maxValue = arr[0][0];
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j <  arr[i].length; j++){
                if(arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println(maxValue);
    }
}
