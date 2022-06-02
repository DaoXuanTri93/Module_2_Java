package exampleSlack;

public class McQueen extends Machine implements Runable{

    public McQueen(){

    }

    public McQueen(String name){
       super(name);
    }

    @Override
    public void runable() {
        System.out.println(getName() + " co the chay");
    }
}
