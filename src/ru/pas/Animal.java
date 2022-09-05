package ru.pas;

public class Animal {

    // Поля объекта
    private int paws; // лапы
    private float tail; // хвост

    // Конструктор обращения к классу
    public Animal (int paws, float tail) {
        // Проверка данных
        if (paws != 0 && paws <=4 && tail < 2f) {
            this.paws = paws;
            this.tail = tail;
        } else {
            say("Невидана зверушка!");
            return;
        }
    }

    // Конструктор класса по умолчанию (без параметров)
    // Позволяет создать пустой объёкт и потом назначить значения через set'ерры
    public Animal () {}

    // Конструктор для копирования объектов
    public Animal(Animal animal) {
        this(animal.getPaws(), animal.getTail());
    }

    // Функции объектов класса
    void say (String blabla) { System.out.println(blabla); }

    // Функция класса для обращения через класс без создания объекта
    static void write(String str){
        System.out.println(str);
    }

    // Методы
    public void setPaws(int paws){
        if (paws != 0 && paws <=4)
            this.paws = paws;
        else {
            System.out.println("Что-то с лапами не то...");
        }
    }

    public void setTail(float tail){
        if (tail < 2)
            this.tail = tail;
        else System.out.println("Не многовато ли хвостов?");
    }

    public int getPaws (){
        return this.paws;
    }

    public float getTail (){
        return this.tail;
    }

}
