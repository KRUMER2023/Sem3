//WAP sum of ages which is not equal to 25

import java.util.Scanner;

public class prob6 {
    public static void main(String[] args) {
        int []age=new int[10];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ages 1 by 1:\n");
        for(int i=0;i<10;i++)
        {
            System.out.print("enter the "+i+" person age: ");
            age[i]=sc.nextInt();
            if(age[i]==25)
            {
                continue;
            }
            else
            {
                sum=sum+age[i];
            }
        }
        sc.close();
        System.out.println("sum= "+sum);
    }
    
}
