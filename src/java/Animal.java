// Создайте родительский класс Animal
// Свойства: name, age, weight, color
// Методы:
// Getter and Setter
// Say(Вывод на экран: «Я говорю»),
// Go(Вывод на экран: «Я иду»),
// Drink(Вывод на экран: «Я пью»),
// Eat(Вывод на экран: «Я ем»)



public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String a, int b, int c, String d){
        name = a;
        age = b;
        weight = c;
        color = d;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

        public void Say () {
            System.out.println("Я говорю");
        }

        public void Go () {
            System.out.println("Я иду");
        }

        public void Drink () {
            System.out.println("Я пью");
        }

        public void Eat () {
            System.out.println("Я ем");
        }
}