package org.example5.service;
import lombok.*;
import org.example5.domain.Person;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class PersonService {

    public boolean isAdult(Person person) {
        requireNonNull(person, "Person não pode ser null");
        return person.getAge() >= 18;
    }

}
