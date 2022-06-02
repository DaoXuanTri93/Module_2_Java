package InterfaceJava.comparableCircle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"yellow",false);

        System.out.println("mang : ");
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }

        System.out.println("sau khi sort");
        Arrays.sort(circles);
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
