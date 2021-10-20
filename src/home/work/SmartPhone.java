package home.work;

class SmartPhone extends Phone {
    private String screen;
    private int cameraValue;
    private String typeOfCable;

    SmartPhone(int sN, String m, String w, String sR, int cV, String tOC) {
        super(sN, m, w);
        this.screen = sR;
        this.cameraValue = cV;
        this.typeOfCable = tOC;
    }

    public String getScreen() {
        return screen;
    }

    public int getCameraValue() {
        return cameraValue;
    }

    public String getTypeOfCable() {
        return typeOfCable;
    }

    public void sendMessage(String message) {
        System.out.println("Напищите ваше сообщение: " + message);
    }

}
