public class prob7 {
    public static void main(String[] args) {
        
        String a="Krunal";
        int fin=-1;
        
        System.out.println("String: "+a+"\nFinding the character u : ");
        for(int i=0;i<6;i++)
        {
            if(a.charAt(i)=='u')
            {
                fin=i;
            }
        }     
        if(fin!=-1)
        System.out.println("Index: "+fin);
        else
        System.out.println("Not found");
        

    }
    
}
