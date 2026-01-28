package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import jackson.domain.Transaction;
import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToJson {
    @SneakyThrows
    public static void main(String[] args) {
        Transaction txn = new Transaction("transfer",new Date());
        ObjectMapper objectMapper = new ObjectMapper();
        String stringJson = objectMapper.writeValueAsString(txn);
        System.out.println("Without-formatting:"+stringJson);
        SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(smf);
        String case2 = objectMapper.writeValueAsString(txn);
        System.out.println("With-formatting:"+case2);
    }
}
