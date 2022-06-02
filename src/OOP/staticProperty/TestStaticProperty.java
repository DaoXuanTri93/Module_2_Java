package OOP.staticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car = new Car("xe may 1","honda");
        System.out.println("Số lượng xe được sản xuất là : " + Car.quantityCar);
        Car car2 = new Car("xe may 2","yamaha");
        System.out.println("Số lượng xe được sản xuất là : " + Car.quantityCar);

    }
}
