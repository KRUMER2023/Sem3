import java.util.*;
public class prob9 {
    public static void main(String[] args) {
      int a[]={1,2,3,4,5,6,7,8,9,10};
      int sum=0;
      System.out.println("Array:");
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
        if(a[i]%2==0)
        {
            sum=sum+a[i];
        }
      }
      
      System.out.println("\nSum of all even no.: "+ sum);

    }
    
}
