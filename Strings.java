import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String name = "Harry";
        String fullName = "HARRY POTTER";
        Scanner in = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name2= in.nextLine();
         System.out.println("What is your last name?");
        String name3 = in.nextLine();
        System.out.println("My name is "+name2 + " "+name3);
        for(int i=0; i<name2.length(); i++)
        {
             System.out.println(name2.charAt(i));

        }

        if(name.compareTo(name2)==0){
            System.out.println("String are equal");
        } 
        else{
            System.out.println("String are not equal");

        }
       String sentence = "My name is Harry Potter";
    String name1 = sentence.substring(11,sentence.length());
    System.out.println("Name="+name1);

    String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);


       int number1 = 123;
      String str1 = Integer.toString(number1);
      System.out.println(str1.length());



        
    }
}
