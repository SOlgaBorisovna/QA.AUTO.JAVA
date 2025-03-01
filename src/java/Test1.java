
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {


        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat("Murka", 3, 10, "Grey"));
        animals.add(new Cat("Vaska", 1, 12, "Orange"));
        animals.add(new Cat("Sharik", 7, 11, "Black"));
        animals.add(new Cat("Tuzik", 2, 17, "Brown"));
        animals.add(new Cat("Ga", 7, 2, "White"));
        animals.add(new Cat("Gugu", 3, 4, "Grey"));

        //boolean condition = true;
        String command;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Введите команду:\n ADD - Добавить животное,\n LIST - Вывести всех животных,\n EXIT - Выйти из программы\n");
            command = scan.nextLine().trim().toUpperCase();
            switch (command) {
                case "ADD":
                    addAnimal(animals);
                    break;
                case "LIST":
                    addList(animals);
                    break;
                case "EXIT":
                    break;
                default:
                    System.out.print("error");
            }
        }while (!command.equals("EXIT"));

        scan.close();
    }

    public static void addAnimal(ArrayList<Animal>  animals) {
        System.out.println("Введите животное: cat, dog, duck");
        Scanner scan = new Scanner(System.in);
        String animal = scan.nextLine();
        switch (animal) {
            case "cat": {
                System.out.println("Введите имя:");
                //Scanner scanName = new Scanner(System.in);
                String nameCat = scan.nextLine();

                System.out.println("Введите возраст:");
                //Scanner scanAge = new Scanner(System.in);
                int ageCat = scan.nextInt();
                String ageCatString = scan.nextLine();

                System.out.println("Введите вес:");
                //Scanner scan5 = new Scanner(System.in);
                int weightCat = scan.nextInt();
                String weightCatString = scan.nextLine();

                System.out.println("Введите цвет:");
                //Scanner scan6 = new Scanner(System.in);
                String colorCat = scan.nextLine();

                Cat newCat = new Cat(nameCat, ageCat, weightCat, colorCat);
                animals.add(newCat);
                newCat.say();
            }
                break;

            case "dog": {
                System.out.print("Введите имя:");
                //Scanner scan7 = new Scanner(System.in);
                String nameDog = scan.nextLine();

                System.out.print("Введите возраст:");
                //Scanner scan8 = new Scanner(System.in);
                int ageDog = scan.nextInt();
                String ageDogString = scan.nextLine();

                System.out.print("Введите вес:");
                //Scanner scan9 = new Scanner(System.in);
                int weightDog = scan.nextInt();
                String weightDogString = scan.nextLine();

                System.out.print("Введите цвет:");
                //Scanner scan10 = new Scanner(System.in);
                String colorDog = scan.nextLine().trim();

                Dog newDog = new Dog(nameDog, ageDog, weightDog, colorDog);
                animals.add(newDog);

                newDog.say();
            }
                break;

            case "duck": {
                System.out.print("Введите имя:");
                //Scanner scan11 = new Scanner(System.in);
                String nameDuck = scan.nextLine();

                System.out.print("Введите возраст:");
                //Scanner scan12 = new Scanner(System.in);
                int ageDuck = scan.nextInt();
                String ageDuckString = scan.nextLine();

                System.out.print("Введите вес:");
                //Scanner scan13 = new Scanner(System.in);
                int weightDuck = scan.nextInt();
                String weightDuckString = scan.nextLine();

                System.out.print("Введите цвет:");
                //Scanner scan14 = new Scanner(System.in);
                String colorDuck = scan.nextLine();

                Duck newDuck = new Duck(nameDuck, ageDuck, weightDuck, colorDuck);
                animals.add(newDuck);

                newDuck.say();
            }
                break;
        }
    }

    public static void addList(ArrayList<Animal>  animals){
        for(int i = 0; i < animals.size(); i++){
           System.out.println(animals.get(i));
        }
    }

}



