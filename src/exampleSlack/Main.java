package exampleSlack;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Bolt("cho vag");
        animals[1] = new Nemo("fish");
        animals[2] = new AngryBird("bird");
        for (Animal animal : animals){
            if (animal instanceof Barkable){
                ((Barkable) animal).barkable();
//                ((Bolt) animal).runable();
            }
            if(animal instanceof Swimable){
                ((Swimable) animal).swimable();
            }
            if(animal instanceof Flyable){
                ((Flyable) animal).flyable();
            }
        }

        System.out.println("======================");
        Machine[] machines = new Machine[2];
        machines[0] = new McQueen("xe o to");
        machines[1] = new Siddley("may bay ");

        for (Machine machine : machines){
            if(machine instanceof McQueen){
                ((McQueen) machine).runable();
            }
            if (machine instanceof Siddley){
                ((Siddley) machine).flyable();
            }
        }

    }

}
