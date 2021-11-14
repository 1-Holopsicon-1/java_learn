package home.work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auth auth = new AuthImpl();

        System.out.println("0 - Регистрация, 1 - Вход. \n");

        System.out.println(">>>> ");
        int num = scanner.nextInt();

        System.out.println("Логин (email): ");
        String login = scanner.next();

        System.out.println("\nПароль: ");
        String password = scanner.next();

        switch (num) {
            case 0 -> auth.register(login, password);
            case 1 -> auth.login(login, password);
            default -> System.out.println("Не правилная цифра");
        }
    }
}

