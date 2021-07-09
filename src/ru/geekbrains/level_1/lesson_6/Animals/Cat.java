package ru.geekbrains.level_1.lesson_6.Animals;

import ru.geekbrains.level_1.lesson_6.Animals.Animal;

public class Cat extends Animal {
    private static int catCount;

    public Cat( int maxRunDistance) {
        super("Kikky", maxRunDistance, 0);
        catCount ++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Cats cannot swim...");
        return false;
    }

    @Override
    public boolean run(int distance) {
        return distance <= getMaxRunDistance();
    }
}
