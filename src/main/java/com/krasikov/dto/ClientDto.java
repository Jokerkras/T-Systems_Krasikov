package com.krasikov.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ClientDto {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String email;
    private String passport;
    private String address;
    private Set<Long> numbers = new HashSet<Long>();
    private String password;

}
