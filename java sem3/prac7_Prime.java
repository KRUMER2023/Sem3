import java.util.Scanner;

public class prac7_Prime
{
    public static boolean isPrime(int n)
    {
      for(int i=2;i<=Math.sqrt(n);i++)
      {
        if(n%i==0)
        {
          return false;
        }
      }
      return true;
    }
    public static void main(String[] args) 
    {
        int n, i;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to print prime no. :");
        n = sc.nextInt();
        sc.close();
        System.out.println("The prime numbers between 1 to " + n);
        for (i = 2; i <n; i++) 
        {
            if(isPrime(i))
            {
              System.out.print(i+" ");
            }
        }

    }

}
