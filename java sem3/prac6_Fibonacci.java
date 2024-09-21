public class prac6_Fibonacci {
    public static int fRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fRec(n - 1) + fRec(n - 2);
    }

    public static int fNRec(int n) {
        if (n <= 1) {
            return n;
        }
        int prev1 = 1, prev2 = 0, current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 10; 
        
        int resultRecursive = fRec(n);
        System.out.println("Fibonacci number at position " + n + " (recursive): " + resultRecursive);

        int resultNonRecursive = fNRec(n);
        System.out.println("Fibonacci number at position " + n + " (non-recursive): " + resultNonRecursive);
    }
}
