import java.util.Scanner;

public class prac8_MatrixMultiply {

    static void multiply(int m1[][],int m2[][], int res[][]) 
	{ 
		int i, j, k; 
		for (i = 0; i < 3; i++) { 
			for (j = 0; j < 3; j++) { 
				res[i][j] = 0; 
				for (k = 0; k < 3; k++) 
					res[i][j] += m1[i][k] * m2[k][j]; 
			} 
		} 
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]m1=new int [3][3];
        int [][]m2=new int [3][3]; 
        int [][]res=new int [3][3];
        System.out.println("Enter the elements for 1st matrix:");
        for(int i =0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.println("Enter the ele. of position ["+i+"]["+j+"]:");
                m1[i][j]=sc.nextInt();
            }

        }

        System.out.println("Enter the elements for 2nd matrix:");
        for(int i =0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.println("Enter the ele. of position ["+i+"]["+j+"]:");
                m2[i][j]=sc.nextInt();
            }

        }
        sc.close();

        multiply(m1, m2, res);
        
        for(int i =0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.print(res[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }
    
}
