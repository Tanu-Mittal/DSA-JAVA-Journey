import java.util.Scanner;

public class average {
    public static void Average(int a, int b, int c){
        int d;
        d = (a+b+c)/3;
        System.out.println("Average of the numbers = "+d);
    } 
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter three numbers:");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       Average(a,b,c);
    }
}
