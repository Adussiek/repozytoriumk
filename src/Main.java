import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(java.lang.System.in);


        int liczba = 0;
        while (liczba != 9) {
            System.out.println("Witaj w Programie konsolowym !");
            System.out.println("1.zad");
            System.out.println("2.zad");
            System.out.println("3.zad");
            System.out.println("4.zad");
            System.out.println("5.Obliczanie n-tej liczby Fibbonaciego");
            System.out.println("6.Uzyskanie nazwy słownej oceny ");
            System.out.println("7.Obliczanie podatku dochodowego");
            System.out.println("8.zad ");
            System.out.println("9.Zakończ działanie programu.");
            System.out.println("Wybierz tryb : ");

            liczba = sc.nextInt();
            switch (liczba) {
                case 1:
                        break;
                case 2:
                    break;
                case 3:
                        break;
                case 4:

                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                    break;


                default:
                    java.lang.System.out.println("Nie poprawna opcja !!!!");
            }
        }
    }}