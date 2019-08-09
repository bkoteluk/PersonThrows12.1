package pl.homework.lib;

import pl.homework.excep.IncorrectAgeException;
import pl.homework.excep.NameUndefinedException;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null || firstName.length() < 2 || lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException();
        }
        if ( age < 1) {
            throw new IncorrectAgeException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException{
        if ( age < 1) {
            throw new IncorrectAgeException();
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Osoba " + firstName + " " + lastName + " wiek " + age + " PESEL: " + pesel;
    }
}
