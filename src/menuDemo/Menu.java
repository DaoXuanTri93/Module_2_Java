package menuDemo;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int number;
    void menuTong() {
        System.out.println("*********************");
        System.out.println("**   1. menu cha   **");
        System.out.println("**   2. menu con   **");
        System.out.println("**   3. menu chau  **");
        System.out.println("**   4. exit       **");
        System.out.println("*********************");
        do {
            number = sc.nextInt();
            switch (number){
                case 1: menuCha();
                break;
                case 2: menuCon();
                break;
                case 3: menuChau();
                break;
                case 4: System.exit(4);
            }
        }while(number != 4);
    }
    void menuCha() {
        System.out.println("*********************");
        System.out.println("**   1. ten cha   **");
        System.out.println("**   2. tuoi con   **");
        System.out.println("**   3. come back  **");
        System.out.println("**   4. exit       **");
        System.out.println("*********************");
        do {
            number = sc.nextInt();
            switch (number){
                case 1: menuChaCon();
                break;
                case 3: menuTong();
                break;
            }
        }while(number != 3);

    }

    void menuCon(){
        System.out.println("*********MENU CHA CON*********");
        System.out.println("***     1 . ten cha con    ***");
        System.out.println("***     2 . tuoi cha con   ***");
        System.out.println("***     3 . Come back  ***");
        System.out.println("***     4 . Exit       ***");
        System.out.println("**************************");
    }
    void menuChaCon() {
        System.out.println("*********MENU CHA CON*********");
        System.out.println("***     1 . ten cha con    ***");
        System.out.println("***     2 . tuoi cha con   ***");
        System.out.println("***     3 . Come back  ***");
        System.out.println("***     4 . Exit       ***");
        System.out.println("**************************");
        do {
            number = sc.nextInt();
            switch (number){
                case 3: menuCha();
                break;
            }
        }while(number != 3);
    }

    void  menuChau() {

        System.out.println("*********MENU CHAU*********");
        System.out.println("***     1 . ten chau    ***");
        System.out.println("***     2 . tuoi chau   ***");
        System.out.println("***     3 . Come back  ***");
        System.out.println("***     4 . Exit       ***");
        System.out.println("**************************");

    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuTong();
    }
}
