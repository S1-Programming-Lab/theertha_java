import java.util.Scanner;
public class addition
{
    public static void main(String[] args) 
    {
        int p, q,i,j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        q = s.nextInt();
  	    int a[][] = new int[p][q];
            int b[][] = new int[p][q];
            int c[][] = new int[p][q];
            System.out.println("Enter elements of first matrix:");
            for ( i = 0; i < p; i++) 
            {
                for (j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix:");
            for (i = 0; i < p; i++) 
            {
                for ( j = 0; j < q; j++) 
                {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for ( i = 0; i < p; i++) 
            {
                for ( j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for ( i = 0; i < p; i++) 
            {
                for ( j = 0; j < q; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            for (i = 0; i < p; i++) 
            {
                for ( j = 0; j < q; j++) 
                {
                    
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
           
            System.out.println("Matrix after addition:");
            for ( i = 0; i < p; i++) 
            {
            for ( j = 0; j < q; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
    }
}
