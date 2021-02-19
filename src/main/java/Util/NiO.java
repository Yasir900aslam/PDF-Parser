package Util;
import java.io.IOException;
import java.net.URI;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NiO {
    public static void download(String url, String fileName) throws Exception {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get(fileName));
        }
        catch (IOException e)
        {

        }
    }
}
