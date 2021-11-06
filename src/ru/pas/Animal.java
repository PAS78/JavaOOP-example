package ru.pas;

public class Animal {
    private int paws; // лапы
    private float tail; // хвост

    // Конструктор обращения к классу
    public Animal (int paws, float weight) {
        this.paws = paws;
        this.tail = weight;
    }
    // Конструктор по умолчанию (без параметров)
    public Animal () {}

    // Функции объектов класса
    void say (String blabla) {
        System.out.println(blabla);
    }

    // функция класса для обращения через класс без объекта
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
        if (tail <= 1)
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
