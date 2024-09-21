public class prac15 {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner I=o.new Inner();
        // without making an object of the outer class
        // Outer.Inner I=new Outer().new Inner();
        
        I.display();
        o.Method();
    }
    
}

class Outer
{
    class Inner
    {
        public void display()
        {
            System.out.println("Inner");
        }
    }

    void Method()
    {
        class InMethod
        {
            void InMethodDisplay()
            {
                System.out.println("Inside the method");
            }
        }
        InMethod in=new InMethod();
        in.InMethodDisplay();
    }
}