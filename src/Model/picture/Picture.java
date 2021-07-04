package Model.picture;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 *
 */
public class Picture {

    /**
     * @param path
     * @return
     */
    public static int getWidth(String path) throws IOException {
        return ImageIO.read(new File(path)).getWidth();
    }

    /**
     * @param path
     * @return
     */
    public static int getHeight(String path) throws IOException {
        return ImageIO.read(new File(path)).getHeight();
    }

    /**
     * @param width
     * @param height
     * @param path
     * @param image  should be null
     * @return
     * @throws IOException
     */
    public static BufferedImage readFromFile(int width, int height, String path, BufferedImage image) throws IOException {

        File sampleFile = new File(path);

        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        image = ImageIO.read(sampleFile);

        System.err.println("Reading complete." + image);

        return image;
    }

    /**
     * @param path
     * @param image should be not null
     * @throws IOException
     */
    public static void writeToFile(String path, BufferedImage image) throws IOException {

        File output = new File(path);

        ImageIO.write(image, "jpg", output);

        System.err.println("Writing complete");

    }
}
