
import java.util.Scanner;

public class calculator {
    
public static void main(String[] args) 
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers = ");
  int n = in.nextInt();
  int m = in.nextInt();
  System.out.println("Press + for addition \n Press - for subtraction \n Press * for Multiplication \n Press % for modulus \n Press / for division ");
  char ch = in.next().charAt(0);
 switch(ch) 
{
   case '+' :
       System.out.println(n+m);
       break;
   case '-' :
       System.out.println(n-m);
       break;
   case '*' :
       System.out.println(n*m);
       break;
   case '%' :
       System.out.println(n%m);
       break;
   case '/':
       System.out.println((int)(n/m));
       break;
    default:
        System.out.println("Wrong chice");
    }
  }
}


