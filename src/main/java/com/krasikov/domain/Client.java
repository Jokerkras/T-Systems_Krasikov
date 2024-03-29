package com.krasikov.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private Long id;

    private String name;

    private String surname;

    private LocalDate birthday;

    private String email;

    private String passport;

    private String address;

    @OneToMany(mappedBy = "client")
    private Set<MobileNumber> mobileNumbers = new HashSet<>();

    @OneToMany(mappedBy = "client")
    private Set<ContractForNumber> contractForNumbers = new HashSet<>();

    private String password;

    public Client(String name, String surname, LocalDate birthday, String email, String passport, String address, HashSet<MobileNumber> numbers, String password) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.email = email;
        this.passport = passport;
        this.address = address;
        this.mobileNumbers = numbers;
        this.password = password;
    }

    public Client() { }

    public void addNumber(MobileNumber number) {
        mobileNumbers.add(number);
    }

    public boolean removeNumber(MobileNumber mobileNumber) {
        return mobileNumbers.remove(mobileNumber);
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

    public Set<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(Set<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}