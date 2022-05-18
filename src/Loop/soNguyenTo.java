import java.util.Scanner;

public class soNguyenTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 2;
        int count = 0;
        int gioiHan = sc.nextInt();
        while (count < gioiHan) {
            if (checkSNT(number) == true) {
                System.out.println(number);
                count++;
            }
            number++;
        }

    }

    public static boolean checkSNT(int number) {

        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
