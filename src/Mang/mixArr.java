package Mang;
public class mixArr {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int length = array1.length + array2.length;
        int[] result = new int[length];
        int position = 0;

        for (int i = 0; i < array1.length;i++){
            result[position] = array1[i];
            position++;
        }
        for (int i = 0; i < array2.length;i++){
            result[position] = array2[i];
            position++;
//            System.out.println(position);
        }
        for (int element : result){
            System.out.print(element + " ");
        }
    }

}
