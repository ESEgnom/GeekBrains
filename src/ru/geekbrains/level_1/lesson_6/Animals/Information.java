package ru.geekbrains.level_1.lesson_6.Animals;

public class Information {
    public static void main(String[] args)  {
        AnimalGroup groupOne = new AnimalGroup();
        groupOne.add(
                new Cat(10),
                new Cat(200),
                new Dog(150,30)
        );

        for (int i = 0; i < groupOne.getAnimals().length; i++) {
            System.out.println(groupOne.getAnimals()[i]);
            System.out.println("Run: "+ groupOne.getAnimals()[i].run(160));
            System.out.println("Swim: "+ groupOne.getAnimals()[i].swim(30));
        }
        System.out.println("Total One animals: "+ groupOne.getAnimalCount());

        AnimalGroup groupTwo = new AnimalGroup();
        groupTwo.add(
                new Cat(200),
                new Dog(150,30)
        );
        System.out.println("Total Two animals: "+ groupTwo.getAnimalCount());
    }
}
