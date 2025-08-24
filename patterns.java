import java.util.*;

public class patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n,m;
        System.out.println("Enter number of rows and columns:");
        n= in.nextInt();
        m= in.nextInt();
        // SOLID RECTANGLE !!!!!!
        System.out.println("SOLID RECTANGLE !!!!!!");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        // HOLLOW RECTANGLE
        System.out.println("HOLLOW RECTANGLE !!!!!");
         for(int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==m-1)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        // HALF PYRAMID 
        System.out.println("HALF PYRAMID !!!!!!");
         for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
            
                    System.out.print("* ");
                
            }
            System.out.println();
        }
         // INVERTED HALF PYRAMID 
        System.out.println(" INVERTED HALF PYRAMID !!!!!!");
         for(int i=n; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
            
                    System.out.print("* ");
                
            }
            System.out.println();
        }
        // Inverted & Rotated Half Pyramid 
        System.out.println("Inverted & Rotated Half Pyramid !!!!!!");
         for(int i=1; i<=n; i++)
        {
             for (int k=1; k<=n-i; k++)
            {
            
                    System.out.print("  ");
                
            }
            for (int j=1; j<=i; j++)
            {
            
                    System.out.print("* ");
                
            }
            System.out.println();
        }
            //Half Pyramid with Numbers!!!!

            System.out.println("HALF PYRAMID WITH NUMBERS !!!!!!");
         for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
            
                    System.out.print(+j+" ");
                
            }
            System.out.println();
        }
        // INVERTED HALF PYRAMID WITH NUMBERS !!!!!!
        System.out.println(" INVERTED HALF PYRAMID  WITH NUMBERS !!!!!!");
         for(int i=n; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
            
                    System.out.print(j+" ");
                
            }
            System.out.println();
        }
        // Floyd's Triangle!!!!!!
        System.out.println("Floyd's Triangle!!!!");
        int c=1;
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
            
                    System.out.print(c+" ");
                    c++;
                
            }
            System.out.println();
        }
        //0-1 Triangle !!!!!
        System.out.println("0-1 Triangle!!!!");
    
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                     System.out.print("1 ");
                }   

                     else
                     {
                        System.out.print("0 ");
                     }
            
                
            }
            System.out.println();
        }
        // solid rhombus!!!!!
        System.out.println("solid rhombus!!!!!!");
                 for(int i=0; i<n; i++)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print("  ");
            }
            for (int j=0; j<m; j++)
            {
            
                    System.out.print("* ");
                
            }
            System.out.println();
        }
        //NUMBER PYRAMID !!!!!
        System.out.println("NUMBER PYRAMID!!!!!!");
                 for(int i=1; i<=n; i++)
        {
            for(int k=1 ; k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
            
                    System.out.print(i+" ");
                
            }
            System.out.println();
        }

            //palindromic number pyramid. !!!!!
            System.out.println("palindromic number pyramid. !!!!!");
            for(int i=1; i<=n; i++)
             {
           
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           
           for(int j=i; j>=1; j--) {
               System.out.print(j+" ");
           }


         
           for(int j=2; j<=i; j++) {
               System.out.print(j+" ");
           }
           System.out.println();
            

        }



    }
    
}
