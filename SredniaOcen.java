import java.util.Scanner;

public class SredniaOcen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ocene z matematyki: ");
        double matematyka = scanner.nextDouble();

        System.out.println("Podaj ocene z fizyki: ");
        double fizyka = scanner.nextDouble();

        System.out.println("Podaj ocene z chemii: ");
        double chemia = scanner.nextDouble();

        // Oblicz średnią arytmetyczną
        double srednia = (matematyka + fizyka + chemia) / 3;

        // Wyświetl wynik
        System.out.println("Twoja srednia ocen z przedmiotow to: " + srednia);

        scanner.close(); // Zamknięcie obiektu Scanner
    }
}