package ru.pas.MyAnimal;

import ru.pas.Animal;

public class MyAnimal extends Animal {

    // Дополнительное поля у нового Объекта - где ловить
    private String place;

    // Конструктор вызова
    public MyAnimal (int paws, float tail, String place){
        super(paws, tail);
        this.place = place;
    }

    // Переопределение метода
    @Override
    public void say (String blabla) {
        System.out.println(blabla + ", рядом с Сашей.");
    }

    // Метод
    public String getMesto (){
        return this.place;
    }

     // Переменная класса для обращения через класс без объекта
    public static String hello = "Тут будут мои животные.";

}
