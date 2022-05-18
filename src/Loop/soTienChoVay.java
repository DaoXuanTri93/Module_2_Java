package Loop;

import java.util.Scanner;

public class soTienChoVay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui ");
        double tienGui = sc.nextDouble();
        System.out.println("Nhap lai suat nam");
        double laiSuat = sc.nextDouble();
        System.out.println("nhap so thang");
        int soThang = sc.nextInt();
        double tongLai = 0;
        //Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
//        double tienlai = tienGui * laiSuat/12 * soThang;
//        System.out.println("so tien tongLai la " + tienlai);
        for (int i = 0; i < soThang; i++) {
            tongLai += tienGui * (laiSuat/100)/12 * soThang;
        }
        System.out.println("Tổng lãi là : " + tongLai);

    }

}
