package home.work;

import java.util.Scanner;

class Auth {

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin() {

        Scanner sc = new Scanner(System.in);

        CodeGenerator code = new CodeGenerator();
        code.generateCd();

        do {
            System.out.println("Введите email или телефон: ");
            login = sc.nextLine();
        } while (!Cheker.isLoginValid(login));


        System.out.print("Введите код: ");

        int code_in = sc.nextInt();

        if (code.checkCode(code_in)) {
            System.out.println("Правильный");
        } else {
            System.out.println("Неверный");
        }
    }


}
