import java.util.Scanner;

public class Circum {
    public static void circumference(int r)
    {
        double c ;
        c = 2*3.24*r;
        System.out.println("Circumference ="+c);
      }
      
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the radius:");
       int r = sc.nextInt();
       circumference(r);
     }
}
