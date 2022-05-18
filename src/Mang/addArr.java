import java.util.Arrays;

public class addArr {
    public static void main(String[] args) {
        int size = 4;
        int[] arr = {1,2,3};
        int[] newArr = new int[size];
        int position = 2;
        int value = 4;
        if(position < 0 || position > size){
            System.out.println("khong the them vao mang ");
        }
        for (int i = 0; i< newArr.length; i++){

            if(i < position){
                newArr[i] = arr[i];
            } else if(i == position){
                newArr[position] = value;
            } else {
                newArr[i] = arr[i-1];
            }


        }
        System.out.println(Arrays.toString(newArr));
    }
}