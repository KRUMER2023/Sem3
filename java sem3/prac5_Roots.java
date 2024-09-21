import java.util.Scanner;

public class prac5_Roots {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter the value for a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter the value for b: ");
        double b=scanner.nextDouble();
        System.out.println("Enter the value for c: ");
        double c=scanner.nextDouble();

        //b*b-4ac
        double discriminant1=b*b-4*a*c;
        double discriminant2=b*b+4*a*c;
        double x1 = (((-b) + Math.sqrt(discriminant1)))/(2*a);
        //or [(-b – √D)]/2a
        double x2 = (((-b) - Math.sqrt(discriminant1)))/(2*a);
        // or [(-5 – √1)]/2(1);
        System.out.println("Discriminant1 value is: "+ discriminant1);
        
        if(discriminant1<0)
        {
            System.out.println("There are no real solutions");
        }
        else
        {
            System.out.println("1st Roots value is: "+ x1);
            System.out.println("2nd Roots value is: "+ x2);
        }
    }
}