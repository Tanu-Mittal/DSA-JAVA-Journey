import java.util.Scanner;

public class GCD {
    
    // Function to find GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // remainder
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = in.nextInt();
        System.out.print("Enter second number: ");
        int y = in.nextInt();

        int result = gcd(x, y);

        System.out.println("GCD of " + x + " and " + y + " = " + result);
    }
}
