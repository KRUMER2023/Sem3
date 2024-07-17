

public class prob5 {
    public static void main(String[] args) {
        
        String a[]={"arya","manish","aditya","parshwa","anish","krunal"};
        for(int i=0;i<a.length;i++)
        {
            if(a[i].startsWith(String.valueOf('a')))
            {
                System.out.println(a[i]);
            }
        }
    }
    
}
