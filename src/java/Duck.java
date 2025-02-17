// Создайте класс Duck, унаследуйте его от Animal, реализуйте интерфейс Flying
// Переопределить метод Say(Вывод на экран: «Кря»)
// Реализовать метод Fly(Вывод на экран: «Я лечу»)

public class Duck extends Animal {

    public Duck(String a, int b, int c, String d)
    {
        super(a,b,c,d);
    }

    @Override
    public void Say() {
        System.out.println("Кря");
    }
}