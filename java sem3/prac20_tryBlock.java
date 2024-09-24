public class prac20_tryBlock { 
    public static void main(String[] args) { 
        try 
        {
            int nume = 23; 
            int deno = 0; 
            System.out.println("Result of "+nume+"/"+deno+" :"); 
            int result=nume/deno;
            System.out.print(result);       
        } 
        catch (ArithmeticException e) 
        { 
            // Catch arithmetic exception (e.g., division by zero) 
            System.out.println("Error: Division by zero!"); 
        } 
        catch (Exception e) 
        { 
            // Catch any other exceptions 
            System.out.println("Error: " + e.getMessage()); 
        } 
        finally 
        { 
            // Cleanup code (optional) 
            System.out.println("Finally block executed."); 
        } 
    } 
} 