import model.Item;
import model.Order;
import respository.OrderRepository;

public class Client {
    public static void main(String[] args) {
        OrderRepository repo = new OrderRepository();

        Order orderKyle = new Order("AC17","Kyle");
        orderKyle.addItem(new Item("P100",2));
        orderKyle.addItem(new Item("P101",5));

        repo.saveToXml(orderKyle);

        Order order = repo.XmlToObj();
        System.out.println(order.toString());
    }
}
