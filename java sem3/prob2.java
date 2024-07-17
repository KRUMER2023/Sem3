//QUE:-
//take any of no. from user but between 1 to 100
//then code wil prints all the pairs of odd no. whose sum is 28

import java.util.Scanner;

public class prob2 
{
    public static void main(String[] args) 
    {
        Scanner n=new Scanner(System.in);
        int s,e;

        System.out.println("Enter the starting range(1-100):");
        s=n.nextInt();
        System.out.println("Enter the Ending range(1-100):");
        e=n.nextInt();
        
        for(int i=s;i<=e;i++)
        {
            if(i%2!=0)
            {
                //System.out.print(i );
                for(int j=i;j<=e;j=j+2)
                {
                    if((i+j)==28)
                    {
                        System.out.println(i+" + "+ j + "=28");
                    }
                }
            }
        }
    }
    
}
