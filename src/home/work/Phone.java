package home.work;

class Phone {
    private int serialNum;
    private String model;
    private String weight;

    Phone(int sN, String m, String w) {
        this.serialNum = sN;
        this.model = m;
        this.weight = w;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    public void show() {
        System.out.println("Серийный номер: " + this.serialNum + " модель: " + this.model + " вес: " + this.weight);
    }

    public void receiveCall(String n) {
        System.out.println("Входящий: " + n);
    }
}
