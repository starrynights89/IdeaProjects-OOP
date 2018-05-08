package casting;

public class DowncastingExample {

    public static void main(String[] args) {

        Animal animalReference = new Dog(); // Upcasting a Dog object to an Animal reference type

        Dog dogReference = (Dog) animalReference; // Downcasting the Dog object referenced by
        // animalReference into a Dog-typed reference variable. Neither of these operations change
        // the nature of the object itself - it always was, and always be, a Dog!

        Bird birdReference = (Bird) animalReference; // this won't work - it will throw a
        // ClassCastException

        // Use instanceof to check if the object pointed to by a reference variable has an is-a
        // relationship to a particular class.
        if (animalReference instanceof Dog)
            dogReference = (Dog) animalReference;
        else
            System.out.println("animalReference does not point to a Dog object");
    }
}

class Animal {}

class Dog extends Animal {}

class Bird extends Animal {}
