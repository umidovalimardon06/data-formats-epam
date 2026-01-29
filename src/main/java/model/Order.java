package model;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {
    @XmlAttribute(name = "id")
    private String id;
    @XmlElement(name = "customer")
    private String customer;

    @XmlElementWrapper(name = "items")
    @XmlElement(name = "item")
    private List<Item> items = new ArrayList<>();

    public Order() {
    }

    public Order(String id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    public String getId() {
        return id;
    }
    public String getCustomer() {
        return customer;
    }
    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer='" + customer + '\'' +
                ", items=" + items +
                '}';
    }
}
