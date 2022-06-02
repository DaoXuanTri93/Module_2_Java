package exampleSlack;

public class Siddley extends Machine implements Flyable{
    public Siddley(){

    }

    public Siddley(String name){
        super(name);
    }

    @Override
    public void flyable() {
        System.out.println(getName() + " co the bay");
    }


}
