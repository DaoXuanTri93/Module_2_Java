package OOP.staticProperty;

public class Car {
    private String name;
    private String engine;
    protected static int quantityCar;


    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        quantityCar++;
    }


}
