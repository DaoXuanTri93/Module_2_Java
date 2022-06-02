package exampleSlack;

public class Bolt extends Animal implements Barkable,Runable{

    public Bolt(){

    }

    public Bolt(String name){
        super(name);
    }

    @Override
    public void barkable() {
        System.out.println( super.getName() +" có thể Sủa");
    }

    @Override
    public void runable() {
        System.out.println(super.getName() + " có thể chạy");
    }

}
