package Labs.Lab6;

import java.util.Scanner;

class Osoba {
    String imie;     // Imie
    String nazwisko; // Nazwisko
    int pesel;    // Pesel
    Scanner scanner = new Scanner(System.in);

    public Osoba(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    Osoba() {
        this.imie = "";
        this.nazwisko = "";
        this.pesel = 0;
    }

    void wyswietl() {
        System.out.println("Imie: " + imie + ", nazwisko: " + nazwisko + ", pesel: " + pesel);
    }

    void wczytaj() {
        // Wczytaj imie nazwisko i pesel
        this.imie = scanner.nextLine();
        this.nazwisko = scanner.nextLine();
        this.pesel = scanner.nextInt();
    }

    String dajImie() {
        // Zwroc imie
        return this.imie;
    }

    String dajNazwisko() {
        // Zwroc nazwisko
        return this.nazwisko;
    }

    int dajPesel() {
        // Zwroc pesel
        return this.pesel;
    }
}

class OsobaTest1 {
    public static void main(String[] args) { // Program testowy
        int pesel;
        int wybor;
        String nazwisko;
        String imie;


        // Tworzenie obiektów ----------
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba("Jan","Braun",18796);
        osoba2.wyswietl();
        osoba1.wyswietl();

        // Wczytywanie danych obiektu
        osoba1.wczytaj();
        osoba1.wyswietl();

        // Testowanie metod -------------
        imie = osoba2.dajImie();
        nazwisko = osoba2.dajNazwisko();
        pesel = osoba2.dajPesel();
        System.out.println(imie + " " + nazwisko + " " + pesel);
    }
}
