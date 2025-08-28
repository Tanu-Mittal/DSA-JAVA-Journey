import java.util.Scanner;

public class sumOfOdd {
    public static void Sum(int n)
    {
        int sum=0;
        for (int i=1 ; i<=n ; i++)
        {
            if(i%2!=0)
            {
                sum = sum+i;
            }

          }
          System.out.println("Sum of odd numbers ="+sum);
    }
     public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the value of n=");
        n = in.nextInt();
       Sum(n);
     }
    
}
