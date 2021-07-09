package ru.geekbrains.level_1.lesson_5;

/**
 *1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 *
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class Information {
    public static void main(String[] args) {
        createArrWorker();
    }
    public static void createArrWorker(){
        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Иванов Сергей", "Директор", "example@mail.ru", "+79658292538", 150000, 45);
        workerArray[1] = new Worker("Петров Алексй", "Охранник", "example1@mail.ru", "+79378252249", 15000, 60);
        workerArray[2] = new Worker("Сергеев Пётр", "Менеджер", "example2@mail.ru", "+79995272371", 45000, 25);
        workerArray[3] = new Worker("Антонов Николай", "Руководитель розничной торговли", "example3@mail.ru", "+79997777777", 120000, 30);
        workerArray[4] = new Worker("Паровозов Аркадий", "Менеджер", "example4@mail.ru", "+79655218279", 45000, 28);
        for (int i = 0; i < workerArray.length; i++) {
            if(workerArray[i].getAge()>40){
                workerArray[i].printInfo();
            }
        }
    }
}
