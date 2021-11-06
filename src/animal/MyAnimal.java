package animal;

import ru.pas.Animal;

public class MyAnimal extends Animal {
    public String mesto; // где ловить

    // Конструктор вызова
    public MyAnimal (int paws, float tail, String place){
        super(paws, tail);
        this.mesto = place;
    }

    // Переменная класса для обращения через класс без объекта
    public static int summ = 478;
}
