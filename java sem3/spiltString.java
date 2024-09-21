import java.util.StringTokenizer;


public class spiltString {
    public static void main(String[] args) {
        
        String text ="htps://localhost/80080/userData?id=5andName='krunal'";
        String text1="he is a boy";
        StringTokenizer s = new StringTokenizer(text1);// 1 para. cons.
        StringTokenizer s1 = new StringTokenizer(text,"=");//2 para cons.
        
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
    }    
}
