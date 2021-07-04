package Model.interfaces;

public interface IPictureModifier {
    static int[] convertRGB(int rgb) {
        int[] rgbArray = new int[3];
        int exp = 16;
        for (int i = 0; i < rgbArray.length; i++) {
            rgbArray[i] = (int)(rgb / (int) (Math.pow(2, exp)));
            rgb = rgb % (int)(Math.pow(2, exp));
            exp = exp - 8;
        }
        return rgbArray;
    }

    static int convertRGB(int... rgb) {
        if (rgb.length != 3) {
            throw new ArrayIndexOutOfBoundsException("Array has to contain 3 int int {red, green, blue}");
        }
        return convertRGB(rgb[0], rgb[1], rgb[2]);
    }

    static int convertRGB(int r, int g, int b) {
        return (int) (Math.pow(2, 16) * r + Math.pow(2, 8) * g + b);
    }
}
