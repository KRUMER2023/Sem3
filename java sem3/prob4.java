import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the age of the user "+(i+1)+" :");
            a[i]=sc.nextInt();
        }
        sc.close();

        for(int i=0;i<=5;i++)
        {
            if(a[i]<18)
            {
                System.out.println("age less then 18 : "+a[i] );
            }
        }
    }
    
}
