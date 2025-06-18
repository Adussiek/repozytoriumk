import java.util.*;

public class Zad3 {
    private static Scanner input = new Scanner(System.in);

    public static void silnia(String[] args) {
        int liczba;
        int wynik = 1;
        int x;

        System.out.println("Podaj silnie: ");
        liczba = input.nextInt();
        if (liczba <= 1) {
            System.out.println("Wynik: " + 1);
        } else {
            for (x = 1; x <= liczba; x++) {
                wynik = liczba * (liczba - 1);
            }
            System.out.println("Silnia: " + wynik);
        }
    }

}