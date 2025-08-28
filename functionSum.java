import java.util.*;
public class functionSum {
     public static int sum(int a,int b)
     {
        return a+b;
     }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println(sum(a,b));
    }
}
