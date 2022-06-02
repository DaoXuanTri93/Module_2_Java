package Mang;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int left = 0;
        int right = arr.length - 1;
        int x = 50;
        int mid = 0;
        boolean flag = false;
        while (left <= right) {
            mid = (left + right) / 2; // mid = 2

            if (x == arr[mid]) {
                flag = true;
                break;
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else if (x > arr[mid]) {
                left = mid + 1;
            }
        }
//        System.out.println(flag);
        if (flag == true) {
            System.out.println(mid);
        } else {
            System.out.println("khong co");
        }
    }
}
