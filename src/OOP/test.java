package OOP;

public class test {
    private int radius = 2;

    test() {
        this.radius = radius;
    }
    static void a(){
        System.out.println("static");
    }

    @Override
    public String toString() {
        return "day la test " + this.radius;
    }
//
//    void hello(){
//        System.out.println("hello");
//    }


    public static void main(String[] args) {
        test test1 = new test();
        Object test = new Object();
//        test.toString();

        System.out.println(test1);


    }
}
