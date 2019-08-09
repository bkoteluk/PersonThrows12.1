package pl.homework.excep;

public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException() {
        super("Podano błędne lub niepełne dane imię / nazwisko");
    }
}
