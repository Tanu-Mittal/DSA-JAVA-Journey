import java.util.*;
class inputFromUser
{
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name = ");
        String  name = in.nextLine();
        System.out.println("Name= "+name);
        System.out.println("Enter 2 numbers=");
        int a = in.nextInt();
        int b= in.nextInt();
        int sum = a+b;
        System.out.println("Sum= "+sum);

    }
}