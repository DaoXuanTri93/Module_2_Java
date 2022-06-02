package OOP.override;

public class AnimalDog extends Object {


    @Override
    public String toString(){
        return "0";
    }

    public static void main(String[] args) {
        Object obj = new Object();
        obj.toString();
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.eat();
        dog.eat();

    }
}
