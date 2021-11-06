package ru.pas;

import animal.MyAnimal;

public class Main {

    public static void main(String[] args) {
        // Создаем объект Свинтус класса Анимал
        Animal Svintus = new Animal();

        // Присваение значений объекут Свинтус
        Svintus.setPaws(4);
        Svintus.setTail(1);

        // Создание объекта Мася класса Анимал с присвоением значений
        Animal Masya = new Animal(4, 1f);

        // Создание объекта Алкор класса МойАнимал с присвоением значений
        MyAnimal Alkor = new MyAnimal(3,0.25f,"Николавна");

        // Вызов функции say для объекта Свинтус с методамии внутри
        Svintus.say("Хрю-Хрюю, у меня " + Svintus.getPaws() + " лапы и " + Svintus.getTail() + " хвост.");
        Masya.say("Мяу! у меня тоже " + Masya.getPaws() + " лапы и " + Masya.getTail() + " хвост.");

        System.out.println("А у меня " + Alkor.getPaws() + " лапы и " + Alkor.getTail() + " от хвоста.\nА ловить меня надо у: " + Alkor.getMesto());

        // Прямое обращение к переменной summ класса МойАнимал
        System.out.println(MyAnimal.summ);

        // Прямое обращение к функции write класс Animal
        Animal.write("\nСаша - лучший java кодер!");
    }
}
