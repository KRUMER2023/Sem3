import java.util.Scanner;

public class prob10 {

    public static int index = 0;
    public static String fruit[];

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new fruit name: ");
        String newFruit = sc.next();
        if (index == (fruit.length - 1)) {
            System.out.println("The container is Full...");
            return;
        }
        for (int i = 0; i <= index; i++) {
            if (fruit[i] != null) {
                if (fruit[i].equals(newFruit)) {
                    System.out.println("Already in the container enter again");
                    add();
                    return;
                }
            }
        }
        fruit[index] = newFruit;
        System.out.println("New fuit added...");
        index++;
        return;
    }

    public static void Delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int ind = sc.nextInt();
        if (ind > fruit.length || ind < 0) {
            System.out.println("Invalid Index Given Please inter again: ");
            Delete();
            return;
        }
        fruit[ind] = null;
        for (int i = 0; i < fruit.length; i++) {
            if (i + 1 == fruit.length) {
                break;
            }
            if (fruit[i] == null) {
                fruit[i] = fruit[i + 1];
                fruit[i + 1] = null;
            }
        }
        System.out.println("Fruit Has been deleted");
        index--;
    }

    public static void Edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int ind = sc.nextInt();
        if (ind > fruit.length || ind < 0) {
            System.out.println("Invalid Index Given Please inter again: ");
            Delete();
            return;
        }
        System.out.println("At " + ind + " index : " + fruit[ind]);
        System.out.println("Enter new fruit:");
        fruit[ind] = sc.next();
        System.out.println("Now Edited at " + ind + " index : " + fruit[ind]);
        System.out.println("Updated the details.....");

    }

    public static void Display() {
        for (int i = 0; i < index; i++) {
            if (fruit[i] != null) {
                System.out.println(fruit[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter container size:");
        fruit = new String[sc.nextInt()];

        int ch = -1;
        // System.out.println("Enter the 1st no. :");
        // a=sc.nextFloat();
        // System.out.println("Enter the 2nd no. :");
        // b=sc.nextFloat();
        do {
            System.out.println("\nEnter what u want to do >>>>");
            System.out.println("1.Add");
            System.out.println("2.Edit");
            System.out.println("3.Delete");
            System.out.println("4.Display All");
            System.out.println("5.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Adding fruit");
                    add();
                    break;
                }

                case 2: {
                    System.out.println("Editing fruit");
                    Edit();
                    break;
                }

                case 3: {
                    System.out.println("Delete fruit");
                    Delete();
                    break;
                }

                case 4: {
                    System.out.println("All fruit");
                    Display();
                    break;
                }

                case 5: {
                    System.out.println("Tahnk you");
                    break;
                }

            }

        } while (ch != 5);
    }

}
