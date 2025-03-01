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

    public Animal(String a, int newAge, int c, String d){
        name = a;
        setAge(newAge);// age = newAge;
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
        if (age > 0)
            this.age = age;
        else {
            this.age = 0;
            // erorr!
        }
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

        public void say () {
            System.out.println("Я говорю");
        }

        public void go () {
            System.out.println("Я иду");
        }

        public void drink () {
            System.out.println("Я пью");
        }

        public void eat () {
            System.out.println("Я ем");
        }

        //Переопределите метод toString (Возврат строки: «Привет! Меня зовут name, мне age лет(/год/года), я вешу - weight кг, мой цвет - color») лет или год, или года должно быть выбрано в зависимости от числа
    //Примеры:
    //Привет! Меня зовут Бобик, мне 5 лет, я вешу - 15 кг, мой цвет - черный

  @Override
    public String toString() {
      return "Привет! Меня зовут " + getName()
              + ", мне " + ageToString()
              + ", я вешу - " + weight + "кг"
              + ", мой цвет - " + color;
  }

  private String ageToString (){
      int first = age;
      int second = age % 100;
      int f = age % 10;
      if (second == 11)
          return(age + " лет");
      else if (f == 0 || f == 5 || f == 6 || f == 7 || f == 8 || f == 9)
          return(age + " лет");
      else if (f == 1)
          return(age + " год");
      else if (f == 2 || f == 3 || f == 4)
          return(age +" года");

      return "";
  }

}