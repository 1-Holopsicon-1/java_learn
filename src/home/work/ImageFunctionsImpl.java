package home.work;

class ImageFunctionsImpl extends ImageFunctions {
    @Override
    int greyScale(int color) throws Exception {
        float[] pixel = WorkRGB.rgbIntToArray(color);
        float avg = (pixel[0] + pixel[1] + pixel[2]) / 3;
        return WorkRGB.rgbArrayToInt(new float[]{avg, avg, avg, pixel[3]});
    }

    @Override
    int sepia(int color) throws Exception {
        float[] pixel = WorkRGB.rgbIntToArray(color);
        float[] newPixel = new float[4];
        float tone = (float) (.299 * pixel[0] + .587 * pixel[1] + .114 * pixel[2]);
        newPixel[0] = (float) ((tone > .8078) ? 1 : tone + .1922);
        newPixel[1] = (float) ((tone < .0549) ? 0 : tone - .0549);
        newPixel[2] = (float) ((tone < .2196) ? 0 : tone - .2196);
        newPixel[3] = pixel[3];
        return WorkRGB.rgbArrayToInt(newPixel);
    }

    @Override
    int inversion(int color) throws Exception {
        float[] pixel = WorkRGB.rgbIntToArray(color);
        pixel[0] = 1 - pixel[0];
        pixel[1] = 1 - pixel[1];
        pixel[2] = 1 - pixel[2];
        return WorkRGB.rgbArrayToInt(pixel);
    }

    @Override
    int toRed(int color) throws Exception {
        float[] pixel = WorkRGB.rgbIntToArray(color);
        pixel[1] = 0;
        pixel[2] = 0;
        return WorkRGB.rgbArrayToInt(pixel);
    }

    @Override
    int toGreen(int color) throws Exception {
        float[] pixel = WorkRGB.rgbIntToArray(color);
        pixel[0] = 0;
        pixel[2] = 0;
        return WorkRGB.rgbArrayToInt(pixel);
    }

    @Override
    int toBlue(int color) throws Exception {
        float[] pixel = WorkRGB.rgbIntToArray(color);
        pixel[0] = 0;
        pixel[1] = 0;
        return WorkRGB.rgbArrayToInt(pixel);
    }

    @Override
    void fft(int color) {
        frequency.merge(color, 1, Integer::sum);
    }
}
