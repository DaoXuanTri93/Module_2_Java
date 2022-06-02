package OOP.override;

public class Dog extends Animal{
    String name = "dog";
    @Override
    protected void eat(){
        System.out.println("day la cach an cua Dog" + name);
    }

}
