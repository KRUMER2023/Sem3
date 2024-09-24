
// this line is to make a user defined package
// first go to the folder where is file is open then open cmd there
// change name of class form prac16_packages to Main while doing javac compilation
// type: "javac -d . prac16_packages.java" which create a package folder in the folder where this file is present
// and if u want to run the code directly  comment the below line of package and run the code
// and then u can import it any other code ......


package myPack.example;

// Define a class within the package 
class MyClass { 
 public void display() {
 System.out.println("This is a method from the user-defined package."); 
 } 
} 

// Main class to demonstrate the usage of the package 
public class prac16_packages { //change name form prac16_packages to Main while doing javac compilation
 public static void main(String[] args) { 
 MyClass obj = new MyClass(); 
 
 obj.display(); 
 } 
}
