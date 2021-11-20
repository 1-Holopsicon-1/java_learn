package home.work;

public class Main {
    public static void main(String[] args) throws Exception {
        WorkRGB worker = new WorkRGB("ahah.jpg");
        ImageFunctionsImpl imageFunc = new ImageFunctionsImpl();

        worker.changeImage(color -> imageFunc.toRed(color));
/*
        worker.changeImage(color -> imageFunc.onlyBlue(color));
        worker.changeImage(color -> imageFunc.onlyGreen(color));
        worker.changeImage(color -> imageFunc.greyScale(color));
        worker.changeImage(color -> imageFunc.sepia(color));
        worker.changeImage(color -> imageFunc.inversion(color));
*/
        worker.save("changed_image.png");

        worker.iterateInImage(color -> imageFunc.fft(color));
        System.out.println(imageFunc.frequency);
    }
}