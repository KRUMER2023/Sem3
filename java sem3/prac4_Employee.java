import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private int Emp_ID;
    private double salary;

    // Constructor
    public Employee(String name, int age, int Emp_ID, double salary) {
        this.name = name;
        this.age = age;
        this.Emp_ID = Emp_ID;  
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Emp ID " + Emp_ID);
        System.out.println("Salary: " + salary);
    }
}

public class prac4_Employee 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading employee details
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter employee age: ");
        int age = scanner.nextInt();
        //scanner.nextLine();  // Consume newline
        
        System.out.println("Enter employee ID: ");
        int EMP_ID = scanner.nextInt();
        
        System.out.println("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Creating an employee object
        Project_Em employee = new Project_Em(name, age, EMP_ID, salary);

        // Displaying employee details
        employee.displayDetails();
        
        // Closing the scanner
        scanner.close();
    }
}
