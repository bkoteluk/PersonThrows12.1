package pl.homework.app;

import pl.homework.excep.IncorrectAgeException;
import pl.homework.excep.NameUndefinedException;
import pl.homework.lib.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonTest {

    public static Person realPersonalData(Scanner sc) throws NameUndefinedException, IncorrectAgeException {

        System.out.print("Podaj imię :");
        String firstName = sc.nextLine();
        System.out.print("Podaj nazwisko :");
        String lastName = sc.nextLine();
        System.out.print("Podaj wiek osoby : ");
        try {
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Podaj PESEL : ");
            String pesel = sc.nextLine();
            return new Person(firstName, lastName, age, pesel);
        } catch (InputMismatchException ex) {
            throw ex;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Person person = realPersonalData(sc);
            System.out.println(">>> Poprawnie wprowadzono dane :" + person);
        } catch ( NameUndefinedException | IncorrectAgeException ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Niezgodna z typem wartość parametru age");
        } finally {
            sc.close();
        }
    }
}
