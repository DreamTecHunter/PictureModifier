package Model.picture.modifier;

import Model.interfaces.IPictureModifier;

import java.awt.image.BufferedImage;

public class PictureModifier implements IPictureModifier {
    public static BufferedImage reverse(BufferedImage image) {
        int[] rgb;
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                rgb = IPictureModifier.convertRGB(image.getRGB(x, y));
                image.setRGB(x, y, IPictureModifier.convertRGB(255 - rgb[0], 255 - rgb[1], 255 - rgb[2]));
            }
        }
        return image;
    }
}
