package Model.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class File {
    public static List<Path> getPaths(final String path) throws IOException {
        Stream<Path> paths = Files.walk(Paths.get(path));
        return paths.filter(Files::isRegularFile).collect(Collectors.toList());
    }
}
