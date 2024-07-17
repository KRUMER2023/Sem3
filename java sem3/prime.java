import java.util.Scanner;

public class prime 
{
    public static void main(String[] args) 
    {
        int n, i, j, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to print prime no. :");
        n = sc.nextInt();
        System.out.println("The prime numbers between 1 to " + n);
        for (i = 1; i <= n; i++) 
        {
            count = 0;
            for (j = 1; j <= i; j++) 
            {
                if (i % j == 0) 
                {
                    count++;
                }
            }
            if (count == 2) 
            {
                System.out.print(i+"\t");
            }
        }

    }

}
