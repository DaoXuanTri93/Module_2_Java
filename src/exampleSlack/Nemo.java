package exampleSlack;

public class Nemo extends Animal implements Swimable,Barkable{
    public Nemo(){

    }
    public Nemo(String name){
        super(name);
    }


    @Override
    public void swimable() {
        System.out.println(getName() + " co the Boi");
    }

    @Override
    public void barkable() {
        System.out.println(getName() + " co the keu chip chip");
    }
}
