package ru.boris.spring.FirstRestApp.util;

public class PersonNotCreatedException extends RuntimeException {
    public PersonNotCreatedException (String msg) {
        super(msg);
    }
}
