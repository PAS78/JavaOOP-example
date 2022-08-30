package ru.pas.MyAnimal;

import ru.pas.Animal;

public class MyAnimal extends Animal {
    private String mesto; // где ловить

    // Конструктор вызова
    public MyAnimal (int paws, float tail, String place){
        super(paws, tail);
        this.mesto = place;
    }

    // Функции объектов класса
    public void say (String blabla) {
        System.out.println(blabla + ", рядом с Сашей.");
    }

    // Метод
    public String getMesto (){
        return this.mesto;
    }

     // Переменная класса для обращения через класс без объекта
    public static String hello = "Тут будут мои животные.";

}
