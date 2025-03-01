// Создайте класс Duck, унаследуйте его от Animal, реализуйте интерфейс Flying
// Переопределить метод Say(Вывод на экран: «Кря»)
// Реализовать метод Fly(Вывод на экран: «Я лечу»)

public class Duck extends Animal implements Flying {

    public Duck(String a, int b, int c, String d)
    {
        super(a,b,c,d);
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");

    }
}

