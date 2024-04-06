import java.util.Scanner;
import java.util.Arrays;

public class SredniaOcen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Utworzenie tablicy na oceny
        Ocena[] oceny = new Ocena[3];

        // Pobranie danych od uzytkownika
        int i = 0;

        System.out.println("Podaj ocene z matematyki: ");
        double matematyka = scanner.nextDouble();
        if(sprawdzOcene(matematyka)){
            oceny[i] = new Ocena("matematyka", matematyka);
            i++;
        }else{
            System.out.println("Podana ocena jest niepoprawna. Wprowadź ocene dodatnia mniejsza od 6.");
        }

        System.out.println("Podaj ocene z fizyki: ");
        double fizyka = scanner.nextDouble();
        if(sprawdzOcene(fizyka)){
            oceny[i] = new Ocena("fizyka", fizyka);
            i++;
        }else{
            System.out.println("Podana ocena jest niepoprawna. Wprowadź ocene dodatnia mniejsza od 6.");
        }

        System.out.println("Podaj ocene z chemii: ");
        double chemia = scanner.nextDouble();
        if(sprawdzOcene(chemia)){
            oceny[i] = new Ocena("chemia", chemia);
            i++;
        }else{
            System.out.println("Podana ocena jest niepoprawna. Wprowadź ocene dodatnia mniejsza od 6.");
        }

        // Oblicz średnią arytmetyczną + wyświetla wyniki
        System.out.println("Lista ocen:");
        double suma = 0;
        double[] tablicaOcen = new double[i];
        for (i = 0; i < oceny.length; i++) {
            //wyświetla ocene z przedmiotu
            System.out.println(oceny[i].getPrzedmiot() + "( "+ oceny[i].getOcena() +" )");

            tablicaOcen[i] = oceny[i].getOcena(); //przygotowanie do liczenia mediany
            double num = oceny[i].getOcena();
            suma += num;
        }
        double srednia = suma / oceny.length;

        System.out.println("Twoja srednia ocen z przedmiotow to: " + srednia);
        //wyswietlenie mediany obliczMediane
        System.out.println("Mediana: " + obliczMediane(tablicaOcen));

        scanner.close(); // Zamknięcie obiektu Scanner
    }

    private static boolean sprawdzOcene(double ocena){
        // Sprawdzenie warunku czy ocena jest dodatnia i mniejsza od 6
        if (ocena > 0 && ocena < 6) {
            return true;
        } else {
            return false;
        }
    }

    private static double obliczMediane(double[] oceny) {
        // Posortowanie tablicy ocen
        Arrays.sort(oceny);

        int n = oceny.length;
        if (n % 2 == 1) {
            // Dla nieparzystej liczby elementów, zwróć ocenę środkową
            return oceny[n / 2];
        } else {
            // Dla parzystej liczby elementów, zwróć średnią arytmetyczną dwóch ocen środkowych
            int middleIndex = n / 2;
            return (oceny[middleIndex - 1] + oceny[middleIndex]) / 2.0;
        }
    }
}