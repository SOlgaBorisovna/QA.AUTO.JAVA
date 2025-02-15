// Создайте класс Dog, унаследуйте его от Animal
// Переопределить метод Say(Вывод на экран: «Гав»)

public class Dog extends Animal {

    @Override
    public void Say() {
        System.out.println("Гав");
    }
}