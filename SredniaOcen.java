import java.util.Scanner;

public class SredniaOcen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Utworzenie tablicy na oceny
        Ocena[] oceny = new Ocena[3];

        // Pobranie danych od uzytkownika
        System.out.println("Podaj ocene z matematyki: ");
        double matematyka = scanner.nextDouble();

        System.out.println("Podaj ocene z fizyki: ");
        double fizyka = scanner.nextDouble();

        System.out.println("Podaj ocene z chemii: ");
        double chemia = scanner.nextDouble();

        // wpisanie danych do tabeli
        oceny[0] = new Ocena("matematyka", matematyka);
        oceny[1] = new Ocena("fizyka", fizyka);
        oceny[2] = new Ocena("fizyka", fizyka);

        // Oblicz średnią arytmetyczną + wyświetla wyniki
        System.out.println("Lista ocen:");
        double suma = 0;
        for (int i = 0; i < oceny.length; i++) {
            //wyświetla ocene z przedmiotu
            System.out.println(oceny[i].getPrzedmiot() + "( "+ oceny[i].getOcena() +" )");

            double num = oceny[i].getOcena();
            suma += num;
        }
        double srednia = suma / oceny.length;

        System.out.println("Twoja srednia ocen z przedmiotow to: " + srednia);

        scanner.close(); // Zamknięcie obiektu Scanner
    }
}