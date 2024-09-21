/*WAP to create Employee Class which display diff. properties acccor.
to the requirement also while creating a object take diffn. values for
an employee detials,acc details,proff. details*/

// public class prac10_MethodAndContructorOverloading {
//     public int add(int a, int b) {
//         return (a + b);
//     }

// }


// -------------------------------------------------------------------------------------
// class Animal {
//     public void makeSound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     // @Override
//     public void makeSound() {
//         System.out.println("Dog barks");
//     }
// }

// public class prac10_MethodAndContructorOverloading {
//     public static void main(String[] args) {
//         Animal myDog = new Dog(); // Dynamic method dispatch
//         myDog.makeSound(); // Outputs: Dog barks
//     }
// }
// -------------------------------------------------------------------------------------

class Prac10_Animal {
    String name;
    int age;
    
    // Constructor Overloading
    Prac10_Animal() {
        System.out.println("An Animal is created.");
    }

    Prac10_Animal(String name) {
        this.name = name;
        System.out.println("Animal's name: " + name);
    }

    Prac10_Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal's name: " + name + ", Age: " + age);
    }

    // Method Overloading
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    void makeSound(String sound) {
        System.out.println("The animal makes a sound: " + sound);
    }

    void makeSound(String sound, int times) {
        System.out.println("The animal makes a sound: " + sound + " " + times + " times.");
    }

    public static void main(String[] args) {
        // Constructor Overloading examples
        Prac10_Animal animal1 = new Prac10_Animal();
        Prac10_Animal animal2 = new Prac10_Animal("Dog");
        Prac10_Animal animal3 = new Prac10_Animal("Cat", 3);

        // Method Overloading examples
        animal1.makeSound();
        animal2.makeSound("Bark");
        animal3.makeSound("Meow", 5);
    }
}
