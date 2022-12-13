package Labs.Lab8;


public class Baza1 {
    int tabSize;
    int lelem;
    public Osoba[] pokoj;
    public Baza1() {
    }
    public Baza1(int size) {
        System.out.println("Konstruktor baza, size: " + size);
        this.tabSize = size;
        pokoj = new Osoba[size];
    }
    public void addToTable(Osoba osoba) {
        pokoj[lelem] = osoba;
        lelem++;
    }

    public void printBaza() {
        int j = 1;
        for (Osoba osoba : pokoj) {
            if (osoba != null) {
                System.out.println(j + " " + osoba.toString()); }
            j++; }
    }
}
