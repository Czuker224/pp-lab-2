import java.util.Scanner;

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
            oceny[i] = new Ocena("matematyka", fizyka);
            i++;
        }else{
            System.out.println("Podana ocena jest niepoprawna. Wprowadź ocene dodatnia mniejsza od 6.");
        }

        System.out.println("Podaj ocene z chemii: ");
        double chemia = scanner.nextDouble();
        if(sprawdzOcene(chemia)){
            oceny[i] = new Ocena("matematyka", chemia);
            i++;
        }else{
            System.out.println("Podana ocena jest niepoprawna. Wprowadź ocene dodatnia mniejsza od 6.");
        }

        // Oblicz średnią arytmetyczną + wyświetla wyniki
        System.out.println("Lista ocen:");
        double suma = 0;
        for (i = 0; i < oceny.length; i++) {
            //wyświetla ocene z przedmiotu
            System.out.println(oceny[i].getPrzedmiot() + "( "+ oceny[i].getOcena() +" )");

            double num = oceny[i].getOcena();
            suma += num;
        }
        double srednia = suma / oceny.length;

        System.out.println("Twoja srednia ocen z przedmiotow to: " + srednia);

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
}