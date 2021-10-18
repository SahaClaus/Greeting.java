import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите Ваше имя:");
        String name = scanner.nextLine();

        System.out.printf("Здравствуйте, %s!", name);
    }
}
