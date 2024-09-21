//WAP on te asset management system

class Add
{
    public void display(int a,int b)
    {
        System.out.println("Addition: "+(a+b));
    }
}

class Sub
{
    public void display(int a,int b)
    {
        System.out.println("Substraction: "+(a-b));
    }
}

class Mul
{
    public void display(int a,int b)
    {
        System.out.println("Multiplication: "+(a*b));
    }
}

class Div
{
    public void display(float a,float b)
    {
        System.out.println("Division: "+(a/b));
    }
}

public class prob8 
{
    public static void main(String[] args) {
        Add add=new Add();
        Sub sub=new Sub();
        Mul mul=new Mul();
        Div div=new Div();
        
        int x=5,y=6;
        add.display(x, y);
        mul.display(x, y);
        sub.display(x, y);
        div.display((float)x, (float)y);
    }
}

