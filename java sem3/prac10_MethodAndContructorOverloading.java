/*WAP to create Employee Class which display diff. properties acccor.
to the requirement also while creating a object take diffn. values for
an employee detials,acc details,proff. details*/

// public class prac10_MethodAndContructorOverloading {
//     public int add(int a, int b) {
//         return (a + b);
//     }

// }

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class prac10_MethodAndContructorOverloading {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Dynamic method dispatch
        myDog.makeSound(); // Outputs: Dog barks
    }
}
