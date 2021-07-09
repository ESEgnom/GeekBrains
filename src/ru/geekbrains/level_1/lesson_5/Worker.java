package ru.geekbrains.level_1.lesson_5;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */
public class Worker {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private int paycheck;
    private int age;

    public Worker(String fullname, String position, String email, String phone, int paycheck, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.paycheck = paycheck;
        this.age = age;
    }

    public void printInfo(){
        System.out.printf("Ф.И.О. - %s;%nВозраст - %s;%nДолжность - %s;%nE-mail - %s;%nНомер " +
                "телефона - " +
                "%s;" +
                "%nЗарплата - %s;%n",fullname, age, position, email, phone, paycheck);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
