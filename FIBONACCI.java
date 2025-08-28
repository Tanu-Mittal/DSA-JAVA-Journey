import java.util.Scanner;

public class FIBONACCI {

    // Function to print Fibonacci series
    public static void printFibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);
    }
}
