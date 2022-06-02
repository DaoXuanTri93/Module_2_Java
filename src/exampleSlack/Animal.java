package exampleSlack;

public abstract class Animal{
    private String name = "animal-sinh";

    Animal(){

    }

    Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
