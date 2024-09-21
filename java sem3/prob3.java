import java.util.Scanner;

public class prob3 {

    public static void main(String[] args) {
        
        Scanner n=new Scanner(System.in);
        int mat,eng;
        while(true)
        {
            System.out.println("Enter the marks of the maths:");
            mat = n.nextInt();
            if(mat<=100&&mat>=1)
            {
                break;
            }
            else
            {
                System.out.println("Plz enter valid no....");
            }
        }
        
        while(true)
        {
            System.out.println("Enter the marks of the English:");
            eng = n.nextInt();
            if(mat<=100&&mat>=1)
            {
                break;
            }
            else
            {
                System.out.println("Plz enter valid no....");
            }
        }
        float per=(eng+mat)/2;
        System.out.println("Percentage:"+per);
        

        }
    
}
