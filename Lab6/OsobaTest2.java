package Labs.Lab6;

import java.util.Arrays;
import java.util.Scanner;

class OsobaTest2 {
    public static void main(String[] args) {
        // Program testowy
        int pesel;
        final int MaxTab = 3;
        String nazwisko;
        String imie;
        Scanner scanner = new Scanner(System.in);
        // Utworzenie tablicy osób
        Osoba[] osobaTab = new Osoba[MaxTab];

        // Wczytywanie osób --------
        for(int i=0;i<MaxTab;i++) {
            // Utworz osobaTab[i] i wprowadz dane
            System.out.print("Imie: ");
            imie = scanner.next();
            System.out.print("Nazwisko: ");
            nazwisko = scanner.next();
            System.out.print("Pesel: ");
            pesel = scanner.nextInt();
            osobaTab[i] = new Osoba(imie, nazwisko, pesel);
        }

        // Wypisywanie osób --------
        for(int i=0;i<MaxTab;i++) {
            System.out.println(osobaTab[i].dajImie() + " " + osobaTab[i].dajNazwisko() + " " + osobaTab[i].dajPesel());
        }
    }
}