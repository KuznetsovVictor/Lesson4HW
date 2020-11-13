package geek.lesson4.hw;

/* 1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
   2. Конструктор класса должен заполнять эти поля при создании объекта;
   3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
   4. Вывести при помощи методов из пункта 3 ФИО и должность.
   5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
   6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
   7. * Подсчитать средние арифметические зарплаты и возраста
   8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер*/

import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private String fio;
    private String position;
    private String phone;
    private double salary;
    private int age;
    private static final AtomicInteger counterEmployee = new AtomicInteger(1);
    private final int id;


    public Employee(String fio, String position, String phone, double salary, int age) {
        id = counterEmployee.getAndIncrement();
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public double increaseSalary() {
        if (age > 45) {
            return salary += 5000;
             }
            return salary;
    }
}