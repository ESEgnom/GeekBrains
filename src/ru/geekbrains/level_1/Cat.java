package ru.geekbrains.level_1.lesson_7;

public class Cat {
    private final String name;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate){
        satiety = plate.reduceAmountFood(4);
        if(satiety){
            System.out.println(name+ " Сыт");
        }else{
        System.out.println(name+ " не хватило еды");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Имя ='" + name + '\'' +
                ", Сытость =" + satiety +
                '}';
    }
}
