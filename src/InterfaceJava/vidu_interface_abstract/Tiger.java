package InterfaceJava.vidu_interface_abstract;

public class Tiger extends Animal implements Edible{

    Tiger(String name){
        super(name);
    }
    @Override
    public String makeSound() {
        return super.getName() + "Gruu";
    }

    @Override
    public String howToEat(){
        return super.getName() + " ăn thịt";
    }
}
