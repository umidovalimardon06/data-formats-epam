package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import jackson.domain.Address;
import jackson.domain.User;
import lombok.SneakyThrows;

import java.io.File;

public class ObjectToJson {
    @SneakyThrows
    public static void main(String[] args) {

        /// Serializing
        Address address = new Address("Tashkent","I1000");
        User user = User.builder()
                .name("Tokyo")
                .age(18)
                .married(false)
                .skills(new String[]{"Coding","Cooking"})
                .address(address)
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("data/user_out.json"),user);
    }
}
