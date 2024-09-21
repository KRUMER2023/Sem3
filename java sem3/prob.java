import java.util.Scanner;

public class prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp ;
        int check,cel;
        float feh;
        System.out.println("Enter the temp int Fahrenheit j:");
        temp=sc.nextInt();
        System.out.println("In which u want to convert \n1.cel\n2.Fah.");
        check=sc.nextInt();
        if(check==1)
        {
            cel=(int)(temp-32)*(5/9);
            System.out.println("tem. in cel: "+cel);
        }
        else
        {
            feh=temp*(9/5)+32;
            System.out.println("tem. in feh : "+feh);
        }
        sc.close();
        
        
    }
    
}
