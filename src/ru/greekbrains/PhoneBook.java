package ru.greekbrains;

import java.util.*;

public class PhoneBook {
    private final HashMap<String, List<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (book.containsKey(surname)) {
            book.get(surname).add(phoneNumber);
        } else {
            book.put(surname, new ArrayList<>(Collections.singletonList(phoneNumber)));
        }
    }

    public List<String> get(String surname) {
        if (book.containsKey(surname)) {
            return book.get(surname);
        }
        return new ArrayList<>();
    }
}
