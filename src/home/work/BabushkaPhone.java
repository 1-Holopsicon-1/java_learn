package home.work;

class BabushkaPhone extends Phone {
    private String year;
    private int buttons;
    private int price;

    BabushkaPhone(int sN, String m, String w, String y, int b, int p) {
        super(sN, m, w);
        this.year = y;
        this.buttons = b;
        this.price = p;
    }

    public String getYear() {
        return year;
    }

    public int getButtons() {
        return buttons;
    }

    public int getPrice() {
        return price;
    }

    public void receiveCall(String n) {
        System.out.println("Вам звонит: " + n);
    }

}
