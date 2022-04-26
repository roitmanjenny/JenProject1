import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Log{
    private Log() {
    }
    static String filePath = "src/results.txt";

    public static void writetofile(Double text) throws IOException {
        Files.writeString(Paths.get(filePath), text.toString() + " ", StandardOpenOption.APPEND);
    }
}
