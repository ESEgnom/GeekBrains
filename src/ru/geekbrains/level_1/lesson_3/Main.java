package ru.geekbrains.level_1.lesson_3;
import java.util.Random;
import java.util.Scanner;
/**
 * 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
public class Main {
    public static void main(String[] args) {
        createGame();
    }
    public static void createGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            int number = random.nextInt(10);
            System.out.print(number);
            for (int i = 0; i < 3; i++) {
                System.out.println("\nВведите число от 0 до 9");
                int answer = scanner.nextInt();
                if (answer != number) {
                    System.out.print("Введенное число " + ((answer < number) ? "меньше, вы не угадали. " :
                            "больше, вы не угадали."));
                } else{
                    System.out.println("вы угадали!!!");
                    break;
                }
            }
            System.out.println("\nПовторить? ДА - 1 , НЕТ - 0");
        } while (scanner.nextInt() == 1);
    }
}



