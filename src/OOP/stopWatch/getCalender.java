package OOP.stopWatch;

import java.util.Calendar;
import java.util.Date;

public class getCalender {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
    // lấy ngày hiện tại của hệ thống
        System.out.println("ngay hien tai : " + cal.get(Calendar.DAY_OF_MONTH));

    // lấy tháng hiện tại, vì java chạy từ 0 - 11 nên phải +1 lên cho đúng hiện tại

    }
}
