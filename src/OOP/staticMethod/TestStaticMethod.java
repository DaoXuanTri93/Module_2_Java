package OOP.staticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // Hàm gọi method Static không cần Khởi tạo đối tượng
        Student s1 = new Student(1,"Tri");
        Student s2 = new Student(2,"Hoang");
        Student s3 = new Student(3,"Minh");
        //Gọi hàm show của từng đối tượng
        s1.show();
        s2.show();
        s3.show();

    }
}
