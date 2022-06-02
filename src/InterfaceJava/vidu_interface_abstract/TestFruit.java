package InterfaceJava.vidu_interface_abstract;

public class TestFruit {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
//            if(fruit instanceof Apple){
//                Edible edible = new Apple();
//                System.out.println(edible.howToEat());
//            }
//            if (fruit instanceof Orange){
//                Edible edible = new Orange();
//                System.out.println(edible.howToEat());
//            }
        }
    }
}
