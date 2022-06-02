package exampleSlack;

public class AngryBird extends Animal implements Flyable {

    public AngryBird(){

    }

    public AngryBird(String name){
        super(name);
    }


    @Override
    public void flyable() {
        System.out.println(getName() + " co the bay");
    }

}
