import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] marks = new int[size];
        for(int i=0; i<size; i++)
        {
            marks[i]= in.nextInt();
        }
        for(int i=0; i<size; i++)
        {
            System.out.println(marks[i]);
        }
    }
    
}
