import java.util.Scanner;

public class zadanie7 {

        public static void zad7(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Podaj podstawe");
            int podstawa= scanner.nextInt();
            System.out.println("Podaj wykładnik");
            int wykładnik= scanner.nextInt();
            int wynik=podstawa;
            for (int i = 1; i < wykładnik; i++) {
                wynik=wynik*podstawa;
            }
            System.out.println(podstawa + " do potęgi " + wykładnik + " to: " + wynik);
        }
}
