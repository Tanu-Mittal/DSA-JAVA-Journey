
    import java.util.*;


public class CumulativeLength {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter size of String :");
     int size = sc.nextInt();
     String array[] = new String[size];
     int totLength = 0;

     System.out.println("Enter string :");


     for(int i=0; i<size; i++) {
       array[i] = sc.next();
       totLength += array[i].length();
     }


     System.out.println("Total String :"+totLength);
   }
}


