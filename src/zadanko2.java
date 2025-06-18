public static long zadanko2(int n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    }

    long a = 0;
    long b = 1;
    int i = 2;

    while (i <= n) {
        long suma = a + b;
        a = b;
        b = suma;
        i = i + 1;

    }
    return b;
}

public class Main {
    public static void main(String args[]) {
        System.out.println(iterFibonacci(3));
    }
    public static long iterFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long a = 0;
        long b = 1;
        int i = 2;

        while (i <= n) {
            long suma = a + b;
            a = b;
            b = suma;
            i = i + 1;
        }
        return b;
    }
}