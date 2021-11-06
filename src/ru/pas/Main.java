package ru.pas;

import animal.MyAnimal;

public class Main {

    public static void main(String[] args) {
        // Создаем объект Свинтус класса Анимал
        Animal Svintus = new Animal();

        // Присвоение значений объекту Свинтус
        Svintus.setPaws(4);
        Svintus.setTail(1);

        // Создание объекта Мася класса Анимал с присвоением значений
        Animal Masya = new Animal(4, 1f);

        // Создание объекта Алкор класса МойАнимал с присвоением значений
        MyAnimal Alkor = new MyAnimal(3,0.25f,"соседей");

        // Создание объекта Филя класса МойАнимал с данными Мася
        Animal Filya = new Animal(Masya);

        // Вызов функции say для объектов Свинтус и Мася с методами внутри
        Svintus.say("Свинтус: Хрю-Хрюю, у меня " + Svintus.getPaws() + " лапы и " + Svintus.getTail() + " хвост.");
        Masya.say("Мася: Мяу! у меня тоже " + Masya.getPaws() + " лапы и " + Masya.getTail() + " хвост.");
        Alkor.say("Алкор: А у меня " + Alkor.getPaws() + " лапы и " + Alkor.getTail() + " от хвоста.\nА ловить меня надо у " + Alkor.getMesto());
        Filya.say("Филя: Мурр. Я как Мася." + Filya.getPaws() + " лапы и " + Filya.getTail() + " хвост.");


        // Прямое обращение к переменной summ класса МойАнимал
        System.out.println(MyAnimal.summ);

        // Прямое обращение к функции write класс Animal
        Animal.write("\nСаша - лучший java кодер!");
    }
}
