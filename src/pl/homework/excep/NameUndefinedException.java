package pl.homework.excep;

public class NameUndefinedException extends Exception {
    public NameUndefinedException() {
        super("Podano błędne lub niepełne dane imię / nazwisko");
    }
}
