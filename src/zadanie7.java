import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Przykład potęgowania.
         */
        Scanner in = new Scanner(System.in);

        // Metoda Math.pow(a, n); podnosi liczbę a do potęgi n.
        // Liczby całkowite
        System.out.println("Podaj liczbę");
        int a = in.nextInt();
        System.out.println("Podaj potęgę");
        int n = in.nextInt();
        int potega = (int)Math.pow(a, n);
        System.out.println(a+" podniesione do potęgi "+n+" wynosi:\n"+potega);

        System.out.println();
        // Potęgowanie liczb  bez metody Math.pow(d,d):
        potega = 1;
        int tmp = n;
        while(tmp>0){
            potega*=a;
            tmp--;
        }
        System.out.println(a+" podniesione do potęgi "+n+" wynosi:\n"+potega);

        System.out.println();
        // Liczby rzeczywiste
        System.out.println("Podaj liczbę rzeczywistą");
        double aD = in.nextDouble();
        System.out.println("Podaj potęgę (l. rzeczywistą)");
        double nD = in.nextDouble();
        double potD = Math.pow(aD, nD);
        System.out.println(aD+" podniesione do potęgi "+nD+" wynosi:\n"+potD);

        System.out.println();
        // Zaokrąglenie do n-tego miejsca po przecinku:
        double pi = Math.PI;
        System.out.println("Podaj dokładność zaokrąglenia");
        n = in.nextInt();
        int zaokr = (int)Math.pow(10, n); // 10 do potęgi n
        pi *= zaokr;
        pi = Math.round(pi);
        pi /= zaokr;
        System.out.println("Zaokrąglenie do "+n+" miejsca po przecinku:\n"+pi);

        System.out.println();
        // Zaokrąglenie do n-tego miejsca po przecinku bez metody Math.pow(d,d):
        pi = Math.PI;
        zaokr = 1;
        tmp = n;
        while(tmp>0){
            zaokr *= 10;
            tmp--;
        }
        pi *= zaokr;
        pi = Math.round(pi);
        pi /= zaokr;
        System.out.println("Zaokrąglenie do "+n+" miejsca po przecinku:\n"+pi);
    }

}