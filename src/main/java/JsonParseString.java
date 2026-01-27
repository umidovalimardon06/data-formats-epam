import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonParseString {
    public static void main(String[] args) {
        Path userJson = Paths.get("data/user.json");
        Path companiesJson = Paths.get("data/companies.json");

        try {
            String userString = Files.readString(userJson);
            String companiesString = Files.readString(companiesJson);

            System.out.println("User: \n"+userString);
            System.out.println("Companies: \n"+companiesString);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
