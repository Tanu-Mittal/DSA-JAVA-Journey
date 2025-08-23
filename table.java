import java.util.*;
public class table
{
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the value of n=");
        n = in.nextInt();
         System.out.println("TABLE OF "+n);
        for(int i=1;i<=10;i++)
        {
          System.out.println(+n+" * "+i+" = " +(n*i));
        }

    }
}   
       