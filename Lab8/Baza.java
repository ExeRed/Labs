package Labs.Lab8;

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
        if (imie.length() == 0 || nazwisko.length() == 0 || pesel < 1) {
            System.out.println("Nazwisko oraz imie powinno sie skladac z conajmniej dwoch liter oraz pesel powinen " +
                    "byc wiekszy od zera");
        } else {
            if (szukaj(pesel) == -1) {
                osobaTab[koniec] = new Osoba(imie, nazwisko, pesel);
                lelem++;
                koniec++;
                sortArray(osobaTab);
            } else {
                System.out.println("Osoba z takim peselem juz istnieje");
            }
        }
    }

    int szukaj(int pesel) {
        int index = -1;
        int low = 0;
        int high = koniec;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (osobaTab[mid] == null) {
                break;
            } else if (osobaTab[mid].getPesel() < pesel) {
                low = mid + 1;
            } else if (osobaTab[mid].getPesel() > pesel) {
                high = mid - 1;
            } else if (osobaTab[mid].getPesel() == pesel) {
                index = mid;
                System.out.println(osobaTab[mid].getImie() + " " + osobaTab[mid].getNazwisko() +
                        " " + osobaTab[mid].getPesel());
                break;
            }
        }
        return index;
    }

    void lista () {
        // Drukuj liste osob ----------------
        // Uzupełnić
        for(int i = 0; i < lelem; i++) {
            System.out.println(osobaTab[i].getImie() + " " + osobaTab[i].getNazwisko() + " " + osobaTab[i].getPesel());
        }
    }

    void usun(int pesel) {       // Usuwamy osobe o peselu pesel
        for (int i = 0; i < lelem; i++) {
            if (osobaTab[i].getPesel() == pesel) {
                osobaTab[i] = null;
                lelem--;
                koniec--;
            }
        }
    }

    void sortArray(Osoba[] osobaTab) {
        for (int i = 0; i < lelem; i++) {
            for (int j = 0; j < lelem; j++) {
                if (osobaTab[i].getPesel() < osobaTab[j].getPesel()) {
                    Osoba a = osobaTab[i];
                    osobaTab[i] = osobaTab[j];
                    osobaTab[j] = a;
                }
            }
        }
    }

}
class BazaTest {
    public static void main(String[] args) {  // Program testowy
        int wybor,pes;
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