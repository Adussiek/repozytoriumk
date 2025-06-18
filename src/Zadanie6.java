import java.util.Scanner;


    public class Zadanie6 {
        public static void liczba_miejsc_zerowych() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj a ");
            int a = scanner.nextInt();
            System.out.println("Podaj b");
            int b = scanner.nextInt();
            System.out.println("Podaj c:");
            int c = scanner.nextInt();

            double delta;

            delta = b * b - 4 * a * c;

            if (delta > 0) {
                System.out.println("Liczba miejsc zerowych to 2");
            } else if (delta == 0) {
                System.out.println("Liczba miejsc zerowych to 1");
            } else {
                System.out.println("Liczba miejsc zerowych to 0");
            }


        }
    }

