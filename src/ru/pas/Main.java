package ru.pas;

// Импортирум класс MyAnimal пакета ru.pas.MyAnimal
import ru.pas.MyAnimal.MyAnimal;

public class Main {

    public static void main(String[] args) {
        // Прямое обращение к переменной hello класса МойАнимал
        System.out.println(MyAnimal.hello);

        // Прямое обращение к функции write класс Animal
        Animal.write("\nСаша - лучший java кодер!");

        // Создаем объект Svintus класса Animal
        Animal Svintus = new Animal();

        // Присвоение значений объекту Svintus
        Svintus.setPaws(4);
        Svintus.setTail(1);

        // Создание объекта Masya класса Animal с присвоением значений
        Animal Masya = new Animal(4, 1f);

        // Создание объекта Alkor класса MyAnimal с присвоением значений
        MyAnimal Alkor = new MyAnimal(3,0.25f,"соседей");

        // Создание объекта Филя класса МойАнимал с данными Мася
        Animal Filya = new Animal(Masya); // а вот так будет копия двух: Animal Filya = Masya;

        Filya.setPaws(2);
        Masya.setPaws(3);

        // Вызов функции say для объектов Svintus и Masya с методами внутри
        Svintus.say("Свинтус: Хрю-Хрюю, у меня " + Svintus.getPaws() + " лапы и " + Svintus.getTail() + " хвост.");
        Masya.say("Мася: Мяу! у меня тоже " + Masya.getPaws() + " лапы и " + Masya.getTail() + " хвост.");
        Alkor.say("Алкор: А у меня " + Alkor.getPaws() + " лапы и " + Alkor.getTail() + " от хвоста.\nА ловить меня надо у " + Alkor.getMesto());
        Filya.say("Филя: Мурр. Я как Мася." + Filya.getPaws() + " лапы и " + Filya.getTail() + " хвост.");

    }
}
