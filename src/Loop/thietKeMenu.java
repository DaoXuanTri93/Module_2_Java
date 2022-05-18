import java.util.Scanner;

public class thietKeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = -1;
        while(check !=  0){
            System.out.println("1. menu");
            System.out.println("2. danh sach");
            System.out.println("3. Thoat");
            check = sc.nextInt();
            switch (check){
                case 1 :
                    for (int i = 0; i <= 5; i++){
                        System.out.println();
                        for (int j = 0; j <= j; j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 2 :
                    for (int i = 0; i < 5; i++){
                        System.out.println();
                        for (int j = i; j < 5; j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 3 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("khong co truong hop nao");
            }
        }
    }
}