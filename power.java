import java.util.Scanner;

public class power {
    public static void PowerFunction(int x, int n) {
        int m = 1; // start from 1 to handle n = 0 properly
        for (int i = 1; i <= n; i++) {
            m *= x;
        }
        System.out.println(x + " ^ " + n + " = " + m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        int x = in.nextInt();
        System.out.print("Enter the value of n = ");
        int n = in.nextInt();
        PowerFunction(x, n);
    }
}
