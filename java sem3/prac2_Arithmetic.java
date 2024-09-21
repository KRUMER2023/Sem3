import java.util.*;


public class prac2_Arithmetic{
    public static void main(String [] args){
        Scanner n=new Scanner(System.in);
        int a,b,c;
        
        System.out.println("ENTER 1ST NUMBER:-");
        a=n.nextInt();
        System.out.println("ENTER 2ST NUMBER:-");
        b=n.nextInt();
        n.close();
        System.out.println("SUM OF TWO ENTERED NUMBERS IS :-            "+(a+b));
        System.out.println("DIFFERENCE OF TWO ENTERED NUMBERS IS :-     "+(a-b));
        System.out.println("MULTIPLICATION OF TWO ENTERED NUMBERS IS :- "+(a*b));
        System.out.println("DIVISION OF TWO ENTERED NUMBERS IS :-       "+(a/b));
        
        c=a&b;
        System.out.println("AND:- "+c);
        
        c=a|b;
        System.out.println("OR:- "+c);
        
        c=a^b;
        System.out.println("XOR:- "+c);
        
        c=a<<b;
        System.out.println("Left side:- "+c);
        
        c=a>>b;
        System.out.println("Right side:- "+c);
        
        n.close();
    }
}
