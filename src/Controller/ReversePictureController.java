package Controller;

import Model.file.File;
import Model.picture.modifier.PictureModifier;
import Model.picture.Picture;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

public class ReversePictureController {
    final static String pathInput = "src\\..\\wwwroot\\input";
    final static String pathOutput = "src\\..\\wwwroot\\output";

    public static void main(String[] args) throws IOException {
        BufferedImage image;
        for (Path path : File.getPaths(pathInput)) {
            image = null;
            image = Picture.readFromFile(Picture.getWidth(path.toAbsolutePath().toString()), Picture.getHeight(path.toAbsolutePath().toString()), path.toString(), image);
            image = PictureModifier.reverse(image);
            Picture.writeToFile(pathOutput + "\\reverse-" + path.getFileName(), image);
        }
    }
}
