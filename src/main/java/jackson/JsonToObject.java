package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import jackson.domain.User;
import lombok.SneakyThrows;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonToObject {
    @SneakyThrows
    public static void main(String[] args) {

        /// Deserializing
        ObjectMapper objectMapper = new ObjectMapper();
        Path userJson = Paths.get("data/user.json");
        String userString = Files.readString(userJson);
        //// System.out.println(userString);

        User user = objectMapper.readValue(userString, User.class);
        System.out.println(user.toString());

    }
}
