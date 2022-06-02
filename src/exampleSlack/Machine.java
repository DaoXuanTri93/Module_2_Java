package exampleSlack;

public abstract class Machine{
    private String name;

    Machine(){

    }
    Machine(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
