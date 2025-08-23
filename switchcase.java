import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("Enter 1 for Hindi \n Enter 2 for English \n Enter 3 for French  ");
         int button = in.nextInt();
           switch(button){
            case 1: System.out.println("Namaste");
            break;
            case 2: System.out.println("Hello");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
           }
           // if(button==1){
        //     System.out.println("Namaste");
        // }
        // else if(button==2){
        //     System.out.println("Hello");
        // }
        // else if(button==3)
        // {
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid button");
        // }
    }
    
}
