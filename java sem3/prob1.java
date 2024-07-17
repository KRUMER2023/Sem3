//QUE:-
//user enter the no. one by one of ht egiven range and 
//if user miss and no. in sequence the code will print missing no.

import java.util.Scanner;

public class prob1 {

    public static void main(String[] args) 
    {
        int a[]=new int[10];
        int con=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no.s one by one start from 21 to 30:");
            for(int i=0;i<10;i++)
            {
                a[i]=sc.nextInt();
            }
        }

        System.out.println("misssing:");
        for(int j=21;j<=30;j++)
        {
            
            for(int i=0;i<10;i++)
            {
                if(a[i]!=j)
                {
                    con++;
                }
            }
            if(con==10)
            {
            System.out.println(j);
            }
            con=0;
        }
    }
}
    

