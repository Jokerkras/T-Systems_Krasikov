package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Client {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String email;
    private String passport;
    private String address;
    private Set<Long> numbers = new HashSet<Long>();
    private String password;

    public Client(String name, String surname, LocalDate birthday, String email, String passport, String address, HashSet<Long> numbers, String password) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.email = email;
        this.passport = passport;
        this.address = address;
        this.numbers = numbers;
        this.password = password;
    }

    public void addNumber(Long number) {
        numbers.add(number);
    }

    public boolean removeNumber(Long number) {
        return numbers.remove(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Long> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Long> numbers) {
        this.numbers = numbers;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
