package pl.homework.app;

import pl.homework.excep.IncorrectAgeException;
import pl.homework.excep.NameUndefinedException;
import pl.homework.lib.Person;

import java.util.Scanner;

public class PersonTest {

    public static void realPersonalData(Scanner sc, Person person) throws NameUndefinedException, IncorrectAgeException{

            System.out.print("Podaj imię :");
            person.setFirstName(sc.nextLine());
            System.out.print("Podaj nazwisko :");
            person.setLastName(sc.nextLine());
            System.out.print("Podaj wiek osoby : ");
            person.setAge(sc.nextInt());
            sc.nextLine();
            System.out.print("Podaj PESEL : ");
            person.setPesel(sc.nextLine());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        try {
            realPersonalData(sc, person);
            System.out.println(">>> Poprawnie wprowadzono dane :" + person);
        } catch ( NameUndefinedException | IncorrectAgeException ex) {
            System.out.println(ex.getMessage());
        } finally {
            sc.close();
        }



    }
}
