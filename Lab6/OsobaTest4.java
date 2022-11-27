package Labs.Lab6;

import java.util.Scanner;

class Baza {
    int lelem;    // aktualna liczba elementow tablicy
    int koniec;   // indeks ostatniego elementu
    int tabSize;
    Osoba[] osobaTab;
    Scanner scanner = new Scanner(System.in);
    public Baza(int size) { // Konstruktor
        System.out.println("Konstruktor baza, size: " + size);
        tabSize  = size;
        osobaTab = new Osoba[size];
        lelem = 0;
        koniec = 0;
    }
    void dodaj() {        // Uzupełnić
        System.out.print("Imie: ");
        String imie = scanner.next();
        System.out.print("Nazwisko: ");
        String nazwisko = scanner.next();
        System.out.print("Pesel: ");
        int pesel = scanner.nextInt();
        osobaTab[pesel] = new Osoba(imie, nazwisko, pesel);
    }

    void szukaj(int pesel) {
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i] != null) {
                if (osobaTab[i].dajPesel() == pesel) {
                    System.out.println(osobaTab[i].dajImie() + " " + osobaTab[i].dajNazwisko() +
                            " " + osobaTab[i].dajPesel());
                }
            }
        }
    }

    void lista () {
        // Drukuj liste osob ----------------
        // Uzupełnić
        for(int i = 0; i < tabSize; i++) {
            if (osobaTab[i] != null) {
                System.out.println(osobaTab[i].dajImie() + " " + osobaTab[i].dajNazwisko() + " " + osobaTab[i].dajPesel());
            }
        }
    }

    void usun(int pesel) {       // Usuwamy osobe o peselu pesel
        if (pesel < tabSize && osobaTab[pesel] != null) {
            osobaTab[pesel] = null;
        }
    }

}
class OsobaTest4 {
    public static void main(String[] args) {  // Program testowy
        int wybor,i,pes;
        final int MaxTab = 10;
        Baza myBaza = new Baza(MaxTab);
        Scanner scanner = new Scanner(System.in);
        // Menu ----------------------------
        do {
            System.out.println("\n1 dodaj, 2 lista, 3 szukaj, 4 usun, 5 koniec");
            wybor = scanner.nextInt();
            System.out.println("\nwybor = " + wybor);
            switch(wybor) {
                case 1: System.out.println("dodaj");
                        myBaza.dodaj();
                        break;
                case 2: System.out.println("lista");
                        myBaza.lista();
                        break;
                case 3: System.out.println("szukaj");
                        System.out.println("Podaj pesel: ");
                        pes = scanner.nextInt();
                        myBaza.szukaj(pes);
                        break;
                case 4: System.out.println("usun");
                        pes = scanner.nextInt();
                        myBaza.usun(pes);
                        break;
            }
        } while(wybor != 5);
        System.out.println("Koniec");
    }
}