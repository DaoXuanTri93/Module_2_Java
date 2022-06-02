package InterfaceJava;

public class testInterface implements InterfaceJAVA{
    @Override
    public void createAbastractMethod(){
        System.out.println("day la phuong thuc method cua lop InterfaceJAVA");
    }
    public void method2(){
        System.out.println("alooo");
    }
    public void method3(){
        System.out.println("day la 3");
    }

    public static void main(String[] args) {
        testInterface testClass = new testInterface();
        testClass.createAbastractMethod();
        testClass.method2();
        testClass.method3();
    }
}
