import java.util.Scanner;
 class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int n = in.nextInt();
        int m = in.nextInt();  
        int[][] arr = new int[n][m];   

        System.out.println("Enter array elements :");


        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= in.nextInt();

            }
        }

        System.out.println("MATRIX =");
         for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        
     }
    
}
