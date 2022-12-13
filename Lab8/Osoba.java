package Labs.Lab8;

import java.util.Scanner;

class Osoba {
    private String imie;     // Imie
    private String nazwisko; // Nazwisko
    private int pesel;    // Pesel
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

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String toString() {
        return this.imie + " " + this.nazwisko + " " + this.pesel;
    }
}

class Student extends Osoba {
    int index;

    public Student(String imie, String nazwisko, int pesel, int index) {
        super(imie, nazwisko, pesel);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getIndex();
    }
}

class StudentInf extends Student {
    String jezykProg;

    public StudentInf(String imie, String nazwisko, int pesel, int index, String jezykProg) {
        super(imie, nazwisko, pesel, index);
        this.jezykProg = jezykProg;
    }

    public String getJezykProg() {
        return jezykProg;
    }

    public void setJezykProg(String jezykProg) {
        this.jezykProg = jezykProg;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.jezykProg;
    }
}

class Pracownik extends Osoba {
    String zakladPracy;

    public Pracownik(String imie, String nazwisko, int pesel, String zakladPracy) {
        super(imie, nazwisko, pesel);
        this.zakladPracy = zakladPracy;
    }

    public String getZakladPracy() {
        return zakladPracy;
    }

    public void setZakladPracy(String zakladPracy) {
        this.zakladPracy = zakladPracy;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.zakladPracy;
    }
}



