import java.util.*;
public class advancepattern {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n,m;
        System.out.println("Enter number of rows and columns:");
        n= in.nextInt();
        m= in.nextInt();
        // BUTTERFLY PATTERN!!!!!!
        System.out.println("BUTTERFLY PATTERN!!!!!!");
         for(int i=0;i<n;i++)
        {
        
            for (int j=0;j<=i;j++)
            {
            
                    System.out.print("* ");
                
            }
            for(int k=0;k<=2*(n-i-1);k++)
            {
                System.out.print("  ");
            }
            
            for (int j=0;j<=i;j++)
            {
            
                    System.out.print("* ");
                
            }
            System.out.println();
        }


         for(int i=n-1;i>=0;i--)
        {
        
            for (int j=0;j<=i;j++)
            {
            
                    System.out.print("* ");
                
            }
            for(int k=0;k<=2*(n-i-1);k++)
            {
                System.out.print("  ");
            }
            
            for (int j=0;j<=i;j++)
            {
            
                    System.out.print("* ");
                
            }
            System.out.println();
        }
        // DIAMOND PATTERN !!!!!!
        System.out.println("DIAMOND PATTERN!!!!!!");

         for(int i=1;i<=n;i++)
        {
             for(int k=1;k<=(n-i);k++)
            {
                System.out.print("  ");
            }
        
            for (int j=1;j<=(2*i-1);j++)
            {
            
                    System.out.print("* ");
                
            }
            System.out.println();
        }
          for(int i=n ; i>=1;i--)
        {
             for(int k=1;k<=(n-i);k++)
            {
                System.out.print("  ");
            }
        
            for (int j=1;j<=(2*i-1);j++)
            {
            
                    System.out.print("* ");
                
            }
            System.out.println();
        }
        //HOLLOW  BUTTERFLY PATTERN!!!!!!
        System.out.println(" HOLLOW BUTTERFLY PATTERN!!!!!!");
         for(int i=0;i<n;i++)
        {
        
            for (int j=0;j<=i;j++)
            {
                  if( i==j || j==0)
                  {
                    System.out.print("* ");

                  }
                    
                  else{
                    System.out.print("  ");
                  }
                
            }
            for(int k=0;k<=2*(n-i-1);k++)
            {
                System.out.print("  ");
            }
           
                    for (int j=0;j<=i;j++)
            {
                  if( i==j || j==0)
                  {
                    System.out.print("* ");

                  }
                    
                  else{
                    System.out.print("  ");
                  }
                
            }
                
            
            System.out.println();
        }


         for(int i=n-1;i>=0;i--)
        {
        
           
            
                    for (int j=0;j<=i;j++)
            {
                  if( i==j || j==0)
                  {
                    System.out.print("* ");

                  }
                    
                  else{
                    System.out.print("  ");
                  }
                
            }
                
            
            for(int k=0;k<=2*(n-i-1);k++)
            {
                System.out.print("  ");
            }
            
            
            
                    for (int j=0;j<=i;j++)
            {
                  if( i==j || j==0)
                  {
                    System.out.print("* ");

                  }
                    
                  else{
                    System.out.print("  ");
                  }
                
            
                
            }
            System.out.println();
        }


         // Hollow rhombus!!!!!
        System.out.println("Hollow rhombus!!!!!!");
                 for(int i=0; i<n; i++)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print("  ");
            }
            for (int j=0; j<m; j++)
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
    }  
    
}
