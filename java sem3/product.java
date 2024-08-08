
import java.util.Scanner;

public class product {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("||||||||| Welcome to the Store |||||||||");
        System.out.println("Enter the gender of coustomer");
        String gender=sc.nextLine();
        Products p1 = new Products();
        Products p2 = new Products();
        Products p3 = new Products();
        Products p4 = new Products();
        Products p5 = new Products();

        p1.input(gender);

    }
    
}

class Products
{
    String name;
    double price;
    String gender;
    static float discount =5;

    void input(String gender)
    {
        System.out.println("Enter Name of Obbject:");
        System.out.println("Enter the price of product:");
    }
}
