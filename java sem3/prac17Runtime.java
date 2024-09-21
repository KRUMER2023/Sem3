import java.util.Scanner;

public class prac17Runtime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String text="";
        String textT="";
        System.out.println("Enter a text:");
        do{
            textT=scanner.nextLine();
            if(!textT.equals("exit"))
            {
                
                text =text+"\n"+textT;
            }
            
        }
        while(!textT.equals("exit"));

        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;
        scanner.close();

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
