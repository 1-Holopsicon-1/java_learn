package home.work;

import java.util.regex.Pattern;

public class Cheker {
    private static boolean isPhoneValid(String s) {
        return Pattern.compile("^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$")
                .matcher(s)
                .matches();
    }

    private static boolean isEmailValid(String s) {
        return Pattern.compile("^[A-Z0-9*._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")
                .matcher(s)
                .matches();
    }

    public static boolean isLoginValid(String s) {
        return isEmailValid(s) || isPhoneValid(s);
    }
}
