import java.util.*;

class Database {
    private String EName;
    private int EId;
    private float ESalary;
    private String EPost;
    private String EGender;
    private String ENationality;
    
    public Database(String eName, int eId, float eSalary, String ePost, String eGender, String eNationality) {
        EName = eName;
        EId = eId;
        ESalary = eSalary;
        EPost = ePost;
        EGender = eGender;
        ENationality = eNationality;
    }

    public String getEName() {
        return this.EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public int getEId() {
        return this.EId;
    }

    public void setEId(int EId) {
        this.EId = EId;
    }

    public float getESalary() {
        return this.ESalary;
    }

    public void setESalary(float ESalary) {
        this.ESalary = ESalary;
    }

    public String getEPost() {
        return this.EPost;
    }

    public void setEPost(String EPost) {
        this.EPost = EPost;
    }

    public String getEGender() {
        return EGender;
    }

    public void setEGender(String eGender) {
        EGender = eGender;
    }

    public String getENationality() {
        return ENationality;
    }

    public void setENationality(String eNationality) {
        ENationality = eNationality;
    }

    @Override
    public String toString() {
        System.out.println("________________________________________________________________________________________________");
        System.out.printf("|%-10s |%-10s |%-10s |%-15s |%-10s |%-15s\n", 
                            "Name", "ID", "Salary", "Post", "Gender", "Nationality");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("|%-10s |%-10d |%-10.2f |%-15s |%-10s |%-15s\n", 
                                EName, 
                                EId, 
                                ESalary, 
                                EPost, 
                                EGender, 
                                ENationality);
        return "";
    }
}

interface EmployeeFunc {
    void addNewEmployee(Scanner scanner,int idRec);

    void displayAllEmployee();

    void editEmployee(int id, Scanner scanner);

    void deleteEmployee(int id);

    Database getEmployeeById(int id);
}

class EmployeeFuncImpl implements EmployeeFunc {
    private Database[] employees = new Database[10];
    private int index = 0;

    @Override
    public void addNewEmployee(Scanner scanner,int idRec) {
        System.out.println("Enter Employee name:");
        String name = scanner.nextLine();

        System.out.println("Employee ID generated : "+idRec);
        
        System.out.println("Enter Employee salary:");
        float salary = scanner.nextFloat();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter Employee post:");
        String post = scanner.nextLine();

        System.out.println("Enter Employee gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter Employee Nationality:");
        String nationality = scanner.nextLine();

        Database employee = new Database(name, idRec, salary, post, gender, nationality);
        if (index < employees.length) {
            employees[index] = employee;
            index++;
        } else {
            System.out.println("Employee storage is full.");
        }
    }

    
    @Override
    public void displayAllEmployee() {
        if (index == 0) {
            System.out.println("No Employee available.");
        } else {
            // Print the table header
            System.out.println("________________________________________________________________________________________________");
            System.out.printf("%-10s %-10s %-10s %-15s %-10s %-15s\n", 
                            "Name", "ID", "Salary", "Post", "Gender", "Nationality");
            System.out.println("------------------------------------------------------------------------------------------------");

            // Loop through the employees and print each employee's details in a tabular format
            for (int i = 0; i < index; i++) {
                System.out.printf("%-10s %-10d %-10.2f %-15s %-10s %-15s\n", 
                                employees[i].getEName(), 
                                employees[i].getEId(), 
                                employees[i].getESalary(), 
                                employees[i].getEPost(), 
                                employees[i].getEGender(), 
                                employees[i].getENationality());
            }
        }
    }
    

    @Override
    public void editEmployee(int id, Scanner scanner) {
        for (int i = 0; i < index; i++) {
            if (employees[i].getEId()==id) {
                System.out.println(employees[i]);
                System.out.println("Enter what u want to edit:-");
                int choice;
                do {
                    System.out.println("\n1. Employee name\n" +
                            "2. Employee salary\n" +
                            "3. Employee post\n" +
                            "4. Employee gender ID\n" +
                            "5. Employee nationality\n" +
                            "6. All details\n"+
                            "7. Exit\n");
        
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new Employee name:");
                            employees[i].setEName(scanner.nextLine());
                            System.out.println("Employee name updated...");
                            break;
                        case 2:
                            System.out.println("Enter new Employee salary:");
                            employees[i].setESalary(scanner.nextFloat());
                            scanner.nextLine(); // Consume newline
                            System.out.println("Employee salary updated...");
                            break;
                        case 3:
                            System.out.println("Enter new Employee post:");
                            employees[i].setEPost(scanner.nextLine());
                            System.out.println("Employee post updated...");
                            break;
                        case 4:
                            System.out.println("Enter new Employee gender:");
                            employees[i].setEGender(scanner.nextLine());
                            System.out.println("Employee gender updated...");
                            break;
                        case 5:
                            System.out.println("Enter new Employee Nationality:");
                            employees[i].setENationality(scanner.nextLine()); 
                            System.out.println("Employee nationality updated...");
                            break;
                        case 6:
                            System.out.println("Enter new Employee name:");
                            employees[i].setEName(scanner.nextLine());

                            System.out.println("Enter new Employee salary:");
                            employees[i].setESalary(scanner.nextFloat());
                            scanner.nextLine(); // Consume newline

                            System.out.println("Enter new Employee post:");
                            employees[i].setEPost(scanner.nextLine());

                            System.out.println("Enter new Employee gender:");
                            employees[i].setEGender(scanner.nextLine());

                            System.out.println("Enter new Employee Nationality:");
                            employees[i].setENationality(scanner.nextLine());
                            System.out.println("Employee all details updated...");
                            break;
                        case 7:
                            System.out.println("Employee Details changes saved........");
                            return;
                        default:
                            System.out.println("Invalid choice. Please try again.");    
                            break;
                    }
                } while (choice != 7);
                
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    @Override
    public void deleteEmployee(int id) {
        for (int i = 0; i < index; i++) {
            if (employees[i].getEId()==id) {
                for (int j = i; j < index - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[index - 1] = null;
                index--;
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    @Override
    public Database getEmployeeById(int id) {
        for (int i = 0; i < index; i++) {
            if (employees[i].getEId()==id) {
                return employees[i];
            }
        }
        return null;
    }
}


public class Project_Em_update {
    
    public static void main(String[] args) {
        EmployeeFuncImpl employeeFunc = new EmployeeFuncImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int idRec=101;
        System.out.println("\nWelcome to Database program\nWhat u want to do:-");

        do {
            System.out.println("\n1. Add new Employee details\n" +
                    "2. Edit Employee Details\n" +
                    "3. View all Employee Details\n" +
                    "4. View Employee by Employee ID\n" +
                    "5. Delete Employee Details\n" +
                    "6. Exit\n");
            System.out.println("Enter choice:-");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    employeeFunc.addNewEmployee(scanner,idRec);
                    idRec++;
                    break;
                case 2:
                    System.out.println("Enter Employee ID to edit:");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    employeeFunc.editEmployee(editId, scanner);
                    break;
                case 3:
                    employeeFunc.displayAllEmployee();
                    break;
                case 4:
                    System.out.println("Enter Employee ID to view:");
                    int viewId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Database employee = employeeFunc.getEmployeeById(viewId);
                    if (employee != null) {
                        System.out.println(employee);
                    } else {
                        System.out.println("Employee with ID " + viewId + " not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter Employee ID to delete:");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    employeeFunc.deleteEmployee(deleteId);
                    break;
                case 6:
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}