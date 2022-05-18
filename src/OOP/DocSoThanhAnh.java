

package OOP;

import java.util.Scanner;

public class DocSoThanhAnh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số vào đây để đọc tiếng anh : ");
        int number  = sc.nextInt();

        //==================================================================

        while (number != -1) {
            if(number < 0 || number >= 1000){
                System.out.println("Số ni chưa làm bạn ơi !!!  ");
                System.out.println("BYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                System.exit(-1);
            }
            int first = (number / 100);
//            System.out.println(first);
            int second = (number % 100) / 10;
//            System.out.println(second);
            int third = number % 10;
//            System.out.println(third);
            if (first == 0 && second == 0) {
                // doc tu 0 - 9
                System.out.println(_0_9_(third));
                number  = sc.nextInt();
            }
            if (second < 2 && first == 0 && second != 0) {
                //doc tu 10 - 19
                System.out.println(_10_19_(third));
                number  = sc.nextInt();
            }
            if (second >= 2 && first == 0) {
                //doc tu 20 - 99
                if (third == 0) {
                    System.out.println(_20_99_(second));
                    number  = sc.nextInt();
//                    return;
                }
                System.out.println(_20_99_(second) + " " + _0_9_(third));
                number  = sc.nextInt();
            }
            if (first >= 1 && first < 1000) {
                // doc tu 100 - 999
                if (third == 0 && second == 0) {
                    System.out.println(_0_9_(first) + " " + _100_999_(first));
                    number  = sc.nextInt();
//                    return;
                }
                if (second == 0) {
                    System.out.println(_0_9_(first) + " " + _100_999_(first) + " and " + _0_9_(third));
                    number  = sc.nextInt();
//                    return;
                }
                if (second < 2) {
                    System.out.println(_0_9_(first) + " " + _100_999_(first) + " and " + _10_19_(third));
                    number  = sc.nextInt();
//                    return;
                }
                if (second >= 2 && third == 0) {
                    System.out.println(_0_9_(first) + " " + _100_999_(first) + " and " + _20_99_(second));
                    number  = sc.nextInt();
//                    return;
                }
                if (second >= 2 && third > 0) {
                    System.out.println(_0_9_(first) + " " + _100_999_(first) + " and " + _20_99_(second) + " and " + _0_9_(third));
                    number  = sc.nextInt();
//                    return;
                }
            }

        }
    }

        public static String _0_9_ ( int tu_0_den_9){
            String donVi = null;
            switch (tu_0_den_9) {
                case 1:
                    donVi = "one";
                    break;
                case 2:
                    donVi = "two";
                    break;
                case 3:
                    donVi = "three";
                    break;
                case 4:
                    donVi = "four";
                    break;
                case 5:
                    donVi = "five";
                    break;
                case 6:
                    donVi = "six";
                    break;
                case 7:
                    donVi = "seven";
                    break;
                case 8:
                    donVi = "eight";
                    break;
                case 9:
                    donVi = "nine";
                    break;
                case 0:
                    donVi = "zero";
                    break;
            }
            return donVi;
        }

        public static String _10_19_ ( int tu_10_den_19){
            String donVi = null;
            switch (tu_10_den_19) {
                case 0:
                    donVi = "ten";
                    break;
                case 1:
                    donVi = "eleven";
                    break;
                case 2:
                    donVi = "twelfth";
                    break;
                case 3:
                    donVi = "thirteen";
                    break;
                case 4:
                    donVi = "fourteen";
                    break;
                case 5:
                    donVi = "fifteen";
                    break;
                case 6:
                    donVi = "sixteen";
                    break;
                case 7:
                    donVi = "seventeen";
                    break;
                case 8:
                    donVi = "eighteen";
                    break;
                case 9:
                    donVi = "nineteen";
                    break;
            }
            return donVi;
        }

        public static String _20_99_ ( int tu_20_den_99){
            String donVi = null;
            switch (tu_20_den_99) {
                case 2:
                    donVi = "twenty";
                    break;
                case 3:
                    donVi = "thirty";
                    break;
                case 4:
                    donVi = "forty";
                    break;
                case 5:
                    donVi = "fifty";
                    break;
                case 6:
                    donVi = "sixty";
                    break;
                case 7:
                    donVi = "seventy";
                    break;
                case 8:
                    donVi = "eighty";
                    break;
                case 9:
                    donVi = "ninety";
                    break;
            }
            return donVi;
        }

        public static String _100_999_ ( int tu_100_den_999){
            return "hundred";
        }

}