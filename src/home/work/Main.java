package home.work;

public class Main {
    public static void main(String[] args) {
        BabushkaPhone babushkaPhone = new BabushkaPhone(123456,
                "Kirpich", "1000", "1991", 12, 4269);

        SmartPhone smartPhone = new SmartPhone(666, "SätänPhöne", "300", "8K", 5, "Type C");

        //BabushPhone
        System.out.println(babushkaPhone.getPrice());
        System.out.println(babushkaPhone.getButtons());
        System.out.println(babushkaPhone.getYear());
        System.out.println();
        babushkaPhone.receiveCall("Calling");
        babushkaPhone.show();

        System.out.println();
        System.out.println();

        //"Smorte"Phone

        System.out.println(smartPhone.getScreen());
        System.out.println(smartPhone.getCameraValue());
        System.out.println(smartPhone.getTypeOfCable());
        System.out.println();
        smartPhone.sendMessage("Hello World!");
        smartPhone.receiveCall("BAAAAB");
        smartPhone.show();

    }
}

