package pl.homework.excep;

public class IncorrectAgeException extends Exception {
    public IncorrectAgeException() {
        super("Niepoprawna dana - wiek osoby mniejszy od 1");
    }
}
