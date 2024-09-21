import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        
        Scanner n=new Scanner(System.in);
        System.out.println("enter no.:");
        int a=n.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
    
}
