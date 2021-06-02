package ru.greekbrains;

import static ru.greekbrains.Animals.massivAnimals;

public class Main {

    public static void main(String[] args) {
        massivAnimals();
        System.out.println();
        System.out.println();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "5598745");
        phoneBook.add("Ivanov", "56229841");
        phoneBook.add("Petrov", "5532658");
        phoneBook.add("Sidorov", "58256555");
        phoneBook.add("Zaderishenkov", "5935589");
        phoneBook.add("Kozlov", "5932658");
        phoneBook.add("Demidov", "5932658");

        System.out.println();
        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Sidorov"));
        System.out.println(phoneBook.get("Zaderishenkov"));
        System.out.println(phoneBook.get("Kozlov"));
        System.out.println(phoneBook.get("Demidov"));
    }
}
