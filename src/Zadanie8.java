import java.util.Scanner;

public class Zadanie8 {


    public static void liczbapierwsza(int args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = n.nextInt();
        boolean pierwsza = true;
        for (int i = 2; i < Math.sqrt(liczba); i++) {
            if ((liczba % i == 0)) {
                pierwsza = false;
            }

        }
        if (pierwsza) {
            System.out.println("Liczba" + liczba + "jest liczba pierwsza");
        } else {
            System.out.println("Liczba" + liczba + "nie jest liczba pierwsza");
        }
    }

    public static void liczbapierwsza() {

    }
}