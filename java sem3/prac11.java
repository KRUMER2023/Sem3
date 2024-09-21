
abstract class Animal {
    
    abstract void makeSound();

    
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}


class Dog extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}


class Cat extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("The cat says Meow!");
    }
}


public class prac11 {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling methods
        dog.makeSound();  
        dog.sleep();      

        cat.makeSound();  
        cat.sleep();      
    }
}
