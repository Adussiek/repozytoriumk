import java.util.Scanner;

public class zad4 { public static int findGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

    // Function to find GCD of an array of numbers
    public static int findGCDofArray(int[] arr) {
        int result = arr[0]; // Start with the first number
        for (int i = 1; i < arr.length; i++) {
            result = findGCD(result, arr[i]);
            if (result == 1) { // If GCD becomes 1, no need to continue
                return 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Taking input for the array elements
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Finding the GCD of the array
        int gcd = findGCDofArray(numbers);

        // Displaying the result
        System.out.println("The GCD of the given numbers is: " + gcd);

        scanner.close();
    }
}

