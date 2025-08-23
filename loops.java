import java.util.*;
public class loops 
{
    public static void main(String[] args) {
        int n,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the value of n=");
        n = in.nextInt();
         System.out.println("USING FOR LOOP");
        for(int i=0;i<=n ;i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of "+n+" natural numbers =" +sum);
        System.out.println("USING WHILE LOOP");
        sum =0;
        int j;
        j = n;
        while( j!=0) {

            sum = sum+j;
            j--;
        }
        System.out.println("Sum of "+n+" natural numbers =" +sum);
         System.out.println("USING DO-WHILE LOOP");
         sum =0;
        int K;
        K = n;
        do {

            sum = sum+K;
            K--;
        }while( K!=0);
        System.out.println("Sum of "+n+" natural numbers =" +sum);
    }
}