import java.util.*;
public class factorial {
     public static int factor(int a)
     {
        if(a<0)
        {
            System.out.println("INVALID NUMBER");
        }
        int f=1;
        for(int i=a; i>=1 ; i--)
        {
            f=f*i;
        }
        return f;
     }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        System.out.println(factor(a));
    }
}
