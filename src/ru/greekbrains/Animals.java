package ru.greekbrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Animals {
    public static void massivAnimals() {
        List<String> words = Arrays.asList(
                "Cat", "Dog", "Sheep", "Fish", "Wolf",
                "Bear", "Cat", "Elk", "Fish", "Elephant",
                "Dog", "Fish", "Coyote", "Fox", "Monkey",
                "Bear", "Wolf", "Fox", "Hare", "Elk"
        );
        HashSet<String> unique = new HashSet<>(words);
        System.out.println("Массив животных");
        System.out.println(words);
        System.out.println("Уникальные животные");
        System.out.println(unique);
        System.out.println("Количество животных в массиве");
        for (String key : unique) {
            System.out.print(key + " " + Collections.frequency(words, key) + " | ");
        }
    }
}
