import java.util.Scanner;

public class EvenFunc {
    public static void EvenOdd(int x) {
         if(x%2==0)
    {
        System.out.println("Number is Even!!!!!");
    }
    else
    {
        System.out.println("Number is Odd!!!!");
    }
          
        
    }
     public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       EvenOdd(n);
     }
    

    
}
