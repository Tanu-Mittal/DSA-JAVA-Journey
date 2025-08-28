import java.util.*;
class Functions{
    public static void  printMyName(String name)
    {
        System.out.println(name);
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name= in.next();
        printMyName(name);
        
    }
    
}