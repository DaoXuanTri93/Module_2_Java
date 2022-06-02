package InterfaceJava.vidu_interface_abstract;

public class Chicken extends Animal implements Edible{


    Chicken(String name){
        super(name);
    }
    @Override
    public String makeSound() {
        return super.getName() + "ò Ó 0";
    }

    @Override
    public String howToEat() {
        return super.getName() + "an chay";
    }
}
