import java.util.Scanner;

public class prac3_Cali {

    public void add(int a,int b)
    {
        System.out.println("add = "+(a+b));
    }

    public void sub(int a,int b)
    {
        System.out.println("sub = "+(a-b));
    }

    public void mul(int a,int b)
    {
        System.out.println("mul = "+a*b);
    }

    public void div(int a,int b)
    {
        System.out.println("div = "+a/b);
    }

    public void reminder(int a,int b)
    {
        System.out.println("remi = "+a%b);
    }

    public void and(int a,int b)
    {
        System.out.println("and = "+(a&b));
    }

    public void or(int a,int b)
    {
        System.out.println("or = "+(a|b));
    }

    public void xor(int a,int b)
    {
        System.out.println("remi = "+(a^b));
    }

    public void leftSide(int a,int b)
    {
        System.out.println("Left side = "+(a<<b));
    }

    public void rightSide(int a,int b)
    {
        System.out.println("Right Side = "+(a>>b));
    }


    public static void main(String[] args) 
    {
        int a,b;
        Scanner n=new Scanner(System.in);
        prac3_Cali d= new prac3_Cali();
        
        System.out.println("Enter the a:");
        a=n.nextInt();
        System.out.println("Enter the b:");
        b=n.nextInt();
        n.close();

        d.add(a,b);
        d.sub(a,b);
        d.mul(a,b);
        d.div(a,b);
        d.reminder(a,b);
        d.and(a, b);
        d.or(a, b);
        d.xor(a, b);
        d.leftSide(a, b);
        d.rightSide(a, b);
        
    }
    
}
