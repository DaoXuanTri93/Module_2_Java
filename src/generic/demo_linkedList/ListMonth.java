package generic.demo_linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ListMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vị trí cần tìm : ");
        int index = sc.nextInt();
        LinkedList<String> month = new LinkedList<>();
        month.add("Tháng 1");
        month.add("Tháng 2");
        month.add("Tháng 3");
        month.add("Tháng 4");
        month.add("Tháng 5");
        month.add("Tháng 6");
        month.add("Tháng 7");
        month.add("Tháng 8");
        month.add("Tháng 9");
        month.add("Tháng 10");
        month.add("Tháng 11");
        month.add("Tháng 12");

//===================================================================================================================

        // Phương thức Get - lấy về giá trị theo Index

//        if (index < 0 || index > (month.size() - 1)) {
//            System.out.println("index phải > 0 và < " + (month.size() - 1));
//        } else {
//            System.out.println("vị trí cần tìm là : " + index + "\n" + "Giá trị trả về là : " + month.get(index));
//        }
//        System.out.println("Giá trị đầu tiên : " + month.getFirst());
//        System.out.println("Giá trị cuối : " + month.getLast());

//===================================================================================================================
        // Phương thức Set - cập nhật lại giá trị

        if (index < 0 || index > (month.size() - 1)) {
            System.out.println("index phải > 0 và < " + (month.size() - 1));
        } else {
            month.set(index,"Tháng Cô Hồn");
            System.out.println(month);
        }
    }
}
