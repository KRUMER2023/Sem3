public class prac21_MultipleTryBlock {
    public static void main(String[] args) {
        try {
            int nume = 23; 
            int deno = 0; 
            System.out.println("Result of "+nume+"/"+deno+" :"); 
            int result=nume/deno;
            System.out.print(result);
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException (division by zero)
            System.out.println("Error: Division by zero!");
        } catch (Exception e) {
            // Catch block for any other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Finally block 1: Cleanup resources (optional)
            System.out.println("First finally block executed.");
        }
        try {
            // Second try block: Access an array element
            int[] array = { 1, 2, 3 };
            int index=3;
            System.out.println("Element at index " + index + ": ");
            System.out.print(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.out.println("Error: Index out of bounds!");
        } catch (Exception e) {
            // Catch block for any other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Finally block 2: Cleanup resources (optional)
            System.out.println("Second finally block executed.");
        }
    }
}
