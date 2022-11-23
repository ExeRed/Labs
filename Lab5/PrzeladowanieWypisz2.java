package Labs.Lab5;

class Pisanie {
    public void wypisz(int liczba) {
        System.out.println("Liczba calkowita: " + liczba);
    }

    public  void wypisz(int pierwsza, int druga) {
        System.out.println("Pierwsza liczba: " + pierwsza +     ", druga liczba: " + druga);
    }

    public void wypisz(double liczba) {
        System.out.println("Liczba rzeczywista: " + liczba);
    }

    public  void wypisz(String tekst) {
        System.out.println("Tekst: " + tekst);
    }

    public  void wypisz(int[] tablica) {
        System.out.print("Tablica int: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    public  void wypisz(double[] tablica) {
        System.out.print("Tablica double: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }
}

public class PrzeladowanieWypisz2 {
    public static void main(String[] args) {
        int[] tabInt = {2, 40, 500} ;
        double[] tabDouble = {3.14, 5.4, 6.6, 12.3 };
        Pisanie pisz = new Pisanie();
        pisz.wypisz(10);
        pisz.wypisz(7, 128);
        pisz.wypisz(3.14);
        pisz.wypisz("Witaj!");
        pisz.wypisz(tabInt);
        pisz.wypisz(tabDouble);
    }
}