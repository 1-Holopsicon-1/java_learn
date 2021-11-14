package home.work;

class AuthImpl extends Auth {
    @Override
    void register(String login, String password) {
        System.out.printf("Register %b: %s", ServerI.getInstance().reg(login, password), login);
    }
    @Override
    void login(String login, String password) {
        System.out.printf("Login %b: %s", ServerI.getInstance().log(login, password), login);
    }
}
