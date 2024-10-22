public class Account {

    // IBAN des Kontos
    private String iban;

    // Kontostand
    private double balance;

    // Eigentümer des Kontos (als Objekt der Klasse Person)
    private Person owner;

    // Konstruktor zur Initialisierung eines neuen Kontos
    public Account(String iban, double balance, Person owner) {
        this.iban = iban;
        this.balance = balance;
        this.owner = owner;
    }

    // Gibt den IBAN zurück
    public String getIban() {
        return iban;
    }

    // Gibt den aktuellen Kontostand zurück
    public double getBalance() {
        return balance;
    }

    // Gibt den Eigentümer zurück
    public Person getOwner() {
        return owner;
    }

    // Überschreibt die Methode toString(), um eine formatierte Ausgabe zu ermöglichen
    @Override
    public String toString() {
        return String.format("%s %.2f %s", iban, balance, owner);
    }

    // Gibt eine Kurzform der Eigentümerinformationen und des Kontostands zurück
    public String ownerBalanceToString(){
        return String.format("%s(%.2f)", owner.shortToString(), balance);
    }
}
