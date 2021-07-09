package ru.geekbrains.level_1.lesson_6.Animals;

public class AnimalGroup {
    private Animal[] animals = new Animal[0];
    private AnimalCounter animalCounter = new AnimalCounter();

    public Animal[] getAnimals() {
        return animals;
    }

    public int getAnimalCount() {
        return animalCounter.getCount();
    }

    public void add(Animal... animals) {
        Animal[] extended = new Animal[this.animals.length + animals.length];

        for (int i = 0; i < this.animals.length; i++) {
            extended[i] = this.animals[i];
        }

        for (int i = extended.length - animals.length; i < extended.length; i++) {
            extended[i] = animals[i];
            animalCounter.increase();
        }
        this.animals = extended;
    }
}
