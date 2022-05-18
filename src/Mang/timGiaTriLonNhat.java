package Mang;

public class timGiaTriLonNhat {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 9, 4, 5, 6};
        int max = 0;
//        System.out.println(max);
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] >= numbers[max]){
                numbers[max] = numbers[i];
            }
        }
        System.out.println(numbers[max]);

    }
}
