import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ParseIntoString {
    public static void main(String[] args) throws IOException {
        try {
            String yaml = Files.readString(Path.of("src/main/resources/application.yaml"));
            System.out.println("Spring-boot configuration \n"+yaml);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
