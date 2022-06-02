package OOP.staticMethod;

public class Student {
    private int id;
    private String name;
    private static String college = "BBDIT";

    // khoi tao constructor
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // khoi tao phuong thuc  Static  voi ten Change
    static void change(){
        college = "CODEGYM";
    }

    // khoi tao phuong thuc Show
    void show(){
        System.out.println(id + " " + name + " " + college);
    }
}
