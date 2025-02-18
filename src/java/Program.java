
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String a = in.nextLine();

        System.out.printf("Введена команда: %s", a);
        in.close();
    }
}
