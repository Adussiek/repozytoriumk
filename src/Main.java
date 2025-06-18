import javax.swing.text.html.ObjectView;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(java.lang.System.in);
        int liczba = 0;
        while (liczba != 9) {
            System.out.println("Witaj w Programie konsolowym !");
            System.out.println("Wybierz numer od 2-9");
            System.out.println("2.zad 2");
            System.out.println("3.zad 3");
            System.out.println("4.zad 4");
            System.out.println("5.zad 5");
            System.out.println("6.zad 6");
            System.out.println("7.zad 7");
            System.out.println("8.zad 8");
            System.out.println("9.Zakończ działanie programu.");
            System.out.println("Wybierz tryb : ");

            liczba = sc.nextInt();
            switch (liczba) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    Zad3.silnia(args);
                    break;
                case 4:
                    zad4.czwarte(args);
                    break;
                case 5:
                    break;
                case 6:
                    Zadanie6.liczba_miejsc_zerowych();
                    break;
                case 7:
                    break;
                case 8:
                    Zadanie8.liczbapierwsza(1);
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    java.lang.System.out.println("Nie poprawna opcja !!!!");
            }
        }
        //Zadanie8 obiekt = new Zadanie8();
        Zadanie8.liczbapierwsza(1);

    }}