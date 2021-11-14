package home.work;

abstract class Auth {
    abstract void register(String login, String password);
    abstract void login(String login, String password);
}
