package ru.geekbrains.level_1.lesson_6.Animals;

public abstract class Animal {
    private String name;
    private int maxSwimDistance;
    private int maxRunDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }
    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }
    public abstract boolean swim(int distance);
    public abstract boolean run(int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", maxSwimDistance=" + maxSwimDistance +
                ", maxRunDistance=" + maxRunDistance +
                '}';
    }
}
