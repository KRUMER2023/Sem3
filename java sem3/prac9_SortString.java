import java.util.Scanner;

public class prac9_SortString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of names that you want to take :");
        int len=sc.nextInt();
        String []names=new String[len];

        for(int i=0;i<names.length;i++)
        {
            System.out.println("Enter names of position "+(i+1) );
            names[i]=sc.next();
        }
        sc.close();

        // FOR EACH LOOP RUN IN FORWAD DIREC. OF THE ARRAY
        /*for(String variable:names)
        {   
            sout(variable+" ");
        }
         */
         
        System.out.println("Original: ");
        for (String name:names)
        {
            System.out.print(name+" ");
        }
        System.out.println();
        
        //Arrays.sort(names);// predefine class in java

        
        for(int i=0;i<len;i++)
        {
            for (int j=0;j<len-1;j++)
            {
                if((names[j].compareTo(names[j+1]))>0)
                {
                    String temp=names[j+1];
                    names[j+1]=names[j];
                    names[j]=temp;
                }
            }
        }
        

        System.out.println("Sorted: ");
        for (String name:names)
        {
            System.out.print(name+" ");
        }
    }
}
