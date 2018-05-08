package java8features;

import java.util.ArrayList;

public class Java8InterfaceExample {
    public static void main(String[] args) {
        Domesticated myDog = new Dog();
        Domesticated.register(myDog);
        myDog.doWork();
        myDog.doWork("play fetch!");
    }
}

interface Domesticated {
    ArrayList<String> animals = new ArrayList<>();
    ArrayList<String> plants = new ArrayList<>();

    static void register(Domesticated species) {
        if (species instanceof  Animal)
            animals.add(species.getClass().getName());
        else if (species instanceof Plant)
            plants.add(species.getClass().getName());
    }

    void doWork();

    default void doWork(String job) {
        System.out.println("I " + job);
    }
}

abstract class Animal {}
abstract class Plant {}

class Dog extends Animal implements Domesticated {
    public void doWork() {
        System.out.println("I hunt for food!");
    }
}

class Wheat extends Plant implements Domesticated {
    public void doWork() {
        System.out.println("I produce large quantities of grain");
    }
}
