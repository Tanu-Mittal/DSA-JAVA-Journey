// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class compare2numbers
 {
   

   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
       int b = in.nextInt();
      if (a==b)
       {
         System.out.println("Numbers are equal!!!!!");
      } 
      else 
      {
        if (a>b)
        {
             System.out.println(+a+" is greater!!!!");
        }
        else
         {
            System.out.println(+b+" is greater!!!!");
         }
      }

   }
}
