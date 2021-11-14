package home.work;

abstract class Server {
    abstract boolean reg(String login, String password);
    abstract boolean log(String login, String password);
}
