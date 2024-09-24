
// write a program to read the line of no. and count the odd and even 
import java.util.Scanner;
import java.util.StringTokenizer;

public class prac19_Token {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        scanner.close();
        StringTokenizer s = new StringTokenizer(text);// 1 para. cons.
        int odd=0;
        int even=0;
        
        while (s.hasMoreTokens()) {
            String token = s.nextToken();
            if(Integer.parseInt(token)%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            
        }
        System.out.println("No. of odd:"+odd+"\nNO. of even:"+even);
    }
}
