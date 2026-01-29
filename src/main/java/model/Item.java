package model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
    @XmlAttribute(name = "sku")
    private String sku;
    @XmlAttribute(name = "quantity")
    private int quantity;

    public Item(){}

    public Item(String sku, int quantity) {
        this.sku = sku;
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "sku='" + sku + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
