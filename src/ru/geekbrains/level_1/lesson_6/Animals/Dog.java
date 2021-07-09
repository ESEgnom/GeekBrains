package ru.geekbrains.level_1.lesson_6.Animals;

import ru.geekbrains.level_1.lesson_6.Animals.Animal;

public class Dog extends Animal {
        private static int dogCount;

    public Dog(int maxSwimDistance, int maxRunDistance) {
        super("Goggy", maxSwimDistance, maxRunDistance);
        dogCount ++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public boolean swim(int distance) {
        return distance <= getMaxSwimDistance();
    }

    @Override
    public boolean run(int distance) {
        return distance <= getMaxRunDistance();
    }
}
