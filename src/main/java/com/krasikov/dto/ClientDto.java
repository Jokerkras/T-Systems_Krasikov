package com.krasikov.dto;

import com.krasikov.domain.Client;
import com.krasikov.domain.MobileNumber;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ClientDto implements Serializable {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String email;
    private String passport;
    private String address;
    private Set<MobileNumber> numbers = new HashSet<>();
    private String password;

    public ClientDto(Client client) {
        name = client.getName();
        surname = client.getSurname();
        birthday = client.getBirthday();
        email = client.getEmail();
        passport = client.getPassport();
        address = client.getAddress();
        numbers = client.getMobileNumbers();
        passport = client.getPassword();
    }

    public ClientDto(String name, String surname, LocalDate birthday, String email, String passport, String address, Set<MobileNumber> numbers, String password) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.email = email;
        this.passport = passport;
        this.address = address;
        this.numbers = numbers;
        this.password = password;
    }

    public ClientDto() {}

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

    public Set<MobileNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<MobileNumber> numbers) {
        this.numbers = numbers;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
