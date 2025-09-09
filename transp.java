import java.util.*;


public class transp {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of rows and columns :");
      int n = sc.nextInt();
      int m = sc.nextInt();

       System.out.println("Enter array elements :");



      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }

              System.out.println("MATRIX =");
         for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
         for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
   }



      
   }

