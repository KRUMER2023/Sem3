
// write a program to read the line of no. and display sum 
import java.util.Scanner;
import java.util.StringTokenizer;

public class prac19_Token {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line on integer (include space between each integer) :");
        String text=scanner.nextLine();
        scanner.close();
        StringTokenizer s = new StringTokenizer(text);// 1 para. cons.
        int sum=0;
        
        System.out.println("\nAdding:");
        while (s.hasMoreTokens()) {
            int no = Integer.parseInt(s.nextToken());
            System.out.println(no);
            sum+=no;
            
        }
        System.out.println("\nSum: "+sum);
    }
}
