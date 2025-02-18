import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", 3, 10, "Grey");
        Cat cat2 = new Cat("Vaska", 5, 12, "Orange");
        Dog dog1 = new Dog("Sharik", 7, 11, "Black");
        Dog dog2 = new Dog("Tuzik", 2, 17, "Brown");
        Duck duck1 = new Duck("Ga", 7, 2, "White");
        Duck duck2 = new Duck("Gugu", 3, 4, "Grey");

        cat1.Say();
        dog1.Say();
        duck1.Say();
        cat1.Eat();
        cat1.Drink();
        cat1.Go();

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(duck2);

        duck1.Fly();

//        ArrayList <String> Animal = new ArrayList<>();
//        Animal.add("Vaska");
    }
}
