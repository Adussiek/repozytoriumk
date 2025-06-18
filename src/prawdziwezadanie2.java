import java.util.Scanner;

public class Main {
    public static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();
        System.out.println("N-ty wyraz Ciągu Fibonacciego to: " + Fibonacci(n));
    }
}