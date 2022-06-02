package InterfaceJava.vidu_interface_abstract;

public abstract class Animal {
    private String name;
    Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public abstract String makeSound();

}
