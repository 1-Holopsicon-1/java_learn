package home.work;

import java.util.HashMap;

abstract class ImageFunctions {
    HashMap<Integer, Integer> frequency = new HashMap<>();
    abstract int greyScale(int color) throws Exception;
    abstract int sepia(int color) throws Exception;
    abstract int inversion(int color) throws Exception;
    abstract int toRed(int color) throws Exception;
    abstract int toGreen(int color) throws Exception;
    abstract int toBlue(int color) throws Exception;
    abstract void fft(int color);
}
