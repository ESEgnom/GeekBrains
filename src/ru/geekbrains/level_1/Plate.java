package ru.geekbrains.level_1.lesson_7;

public class Plate {
    private final int apacity = 10;
    private int amount = apacity;
    public boolean reduceAmountFood(int request){
        if(request > amount){
            return false;
        }
        amount = amount - request;
        return true;
    }
    public void addFood(){
        if(amount < apacity){
            amount = apacity;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "Вместимость тарелки=" + apacity +
                ", Количество еды=" + amount +
                '}';
    }
}
