package Labs.Lab8;

public class Main {
    public static void main(String[] args) {
        Baza1 baza = new Baza1(10);
        baza.addToTable(new Student("John", "Soan", 324145, 21432));
        baza.addToTable(new StudentInf("Valentyn", "Bibik", 042214, 17743, "Java"));
        baza.addToTable(new Pracownik("James", "Charol", 153923, "Fabryka"));
        baza.printBaza();
    }
}
