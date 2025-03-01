// Создайте класс Cat, унаследуйте его от Animal
// Переопределить метод Say(Вывод на экран: «Мяу»)

public class Cat extends Animal {

    public Cat(String a, int b, int c, String d)
    {
        super(a,b,c,d);
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
