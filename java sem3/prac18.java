public class prac18 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("MADAM"));
    }

    
    public static boolean isPalindrome(String str) {
        String reversedStr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversedStr+=str.charAt(i);
        }

        return str.equals(reversedStr);
    }
}