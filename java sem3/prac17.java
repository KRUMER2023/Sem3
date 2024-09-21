import java.util.Scanner;

public class prac17 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = """
                he is a good boy 
                he is also want good marks
                """;

        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;
        

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '\n') {
                lineCount++;
                } 
            
            if (c != ' ' && c != '\t' && c!='\n') {
                charCount++;
            }

            else if(c==' ' || c=='\n')
            {
                wordCount++;
            }
        
        }
        System.out.println("Text Analysis:");
        System.out.println("----------------");
        System.out.println("Characters: " + charCount);
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        
    }
}