package pl.homework.excep;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException() {
        super("Niepoprawna dana - wiek osoby mniejszy od 1");
    }
}
