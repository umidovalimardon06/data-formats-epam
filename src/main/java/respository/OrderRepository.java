package respository;

import lombok.SneakyThrows;
import model.Order;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class OrderRepository {
    private static final Path DIR = Paths.get("data");
    private static final Path ORDER_FILE = DIR.resolve("order.xml");

    private final JAXBContext context;

    @SneakyThrows
    public OrderRepository() {
        this.context = JAXBContext.newInstance(Order.class);
    }

    @SneakyThrows
    public void saveToXml(Order order) {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        OutputStream os = Files.newOutputStream(
                ORDER_FILE,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE
        );
        marshaller.marshal(order, os);
    }

    @SneakyThrows
    public Order XmlToObj() {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream is = Files.newInputStream(ORDER_FILE, StandardOpenOption.READ);
        Object obj = unmarshaller.unmarshal(is);
        return (Order) obj;
    }

}





