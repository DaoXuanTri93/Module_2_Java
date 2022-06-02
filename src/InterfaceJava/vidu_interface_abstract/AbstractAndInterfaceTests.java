package InterfaceJava.vidu_interface_abstract;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken("Ga trong");
        animals[1] = new Tiger("Ho");
        for(Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }

            if(animal instanceof Tiger){
                Edible edible = (Tiger) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
