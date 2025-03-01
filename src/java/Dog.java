// Создайте класс Dog, унаследуйте его от Animal
// Переопределить метод Say(Вывод на экран: «Гав»)

public class Dog extends Animal {

    public Dog(String a, int b, int c, String d)
    {
        super(a,b,c,d);
    }

    @Override
    public void say() {
        System.out.println("Гав");
    }
}