package java8features;

import java.util.ArrayList;

public class Java8InterfaceExample {
    public static void main(String[] args) {
        Domesticated myDog = new Dog();
        Domesticated.registor(myDog);
        myDog.doWork();
        myDog.doWork("play fetch!");
    }
}

interface Domesticated {
    ArrayList<String> animals = new ArrayList<>();
    ArrayList<String> plants = new ArrayList<>();
}
