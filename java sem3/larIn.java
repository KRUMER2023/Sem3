import java.util.Scanner;

public class larIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int lar = 0;
        System.out.println("Enter the elements for matrix:");
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the ele. of position [" + i +"]");
            arr[i] = sc.nextInt();
            if (arr[i] > lar) {
                lar = arr[i];
            }

        }
        sc.close();
        System.out.println("largest:" + lar);
    }

}
