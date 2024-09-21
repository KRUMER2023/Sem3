// WAP to generate random colour guessing game where take colour as an input from the user and match with random genetrated colour by the system
// also manage the no of attemps
import java.util.Random;
import java.util.Scanner;
// import java.util.*;

public class prob12 
{
    public static void main(String[] args) 
    {
        String colours[]={"blue","white","red","yellow","green"};
        Random rand = new Random();
        String Choice;
        // Generate random integers
        int randInt1 = rand.nextInt(5);

        // System.out.println(randInt1);
        Scanner sc=new Scanner(System.in);        
        int attemps=5;

        System.out.println("You have "+attemps+" attemps.");
        System.out.println("U have to pick colour from:");
        for (String string : colours) {
            System.out.print(string+", ");
        }
        System.out.println("\nEnter colour:");

        int i=attemps;
        while (i>0) 
        {
            Choice=sc.nextLine();

            if(Choice==colours[randInt1])
            {
                System.out.println("Picked write colour");
                break;
            }
            else
            {
                System.out.println("U Pick the wrong colour.. ");
                System.out.println("attemps left:"+(i-1));
                System.out.println("Again Enter the colour: ");
            }
        }
        sc.close();
    }
    
}

