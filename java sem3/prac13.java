// Parent class
class Animal {
    String name = "Animal";

    // Method to be overridden
    void sound() {
        System.out.println("Animals make sound");
    }

    // A simple method to show the use of 'super' keyword
    void printName() {
        System.out.println("Name in Animal class: " + name);
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    // Overriding the sound method from Animal class
    @Override
    void sound() {
        System.out.println("Dogs bark");
    }

    // Using 'super' to call the parent class method
    void printName() {
        System.out.println("Name in Dog class: " + name);
        super.printName(); // Calls printName from the parent (Animal) class
    }
}

// Main class to test the method overriding and super keyword
public class prac13 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myDog = new Dog();        // Create a Dog object as Animal (polymorphism)
        
        // Call methods
        myAnimal.sound();  // Calls Animal's sound method
        myDog.sound();     // Calls Dog's overridden sound method

        // Now we create a Dog object to demonstrate the 'super' keyword
        Dog actualDog = new Dog();
        actualDog.printName(); // Demonstrates 'super' usage
    }
}
