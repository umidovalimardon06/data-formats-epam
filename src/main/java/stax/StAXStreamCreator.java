package stax;

import stax.model.Customer;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class StAXStreamCreator {

    public void createDocument(List<Customer> data, String filename) throws XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();

        try (OutputStream out = new FileOutputStream(filename)) {
            XMLStreamWriter writer = factory.createXMLStreamWriter(out, StandardCharsets.UTF_8.name());

            writer.writeStartDocument(StandardCharsets.UTF_8.name(), "1.0");
            writer.writeStartElement("customers");

            for (Customer customer : data) {
                createCustElement(writer, customer);
            }

            writer.writeEndElement();      // </customers>
            writer.writeEndDocument();

            writer.flush();
            writer.close();
        } catch (Exception e) {
            // wrap non-XML exceptions as XMLStreamException for your signature
            throw new XMLStreamException(e);
        }
    }

    private void createCustElement(XMLStreamWriter writer, Customer customer) throws XMLStreamException {
        writer.writeStartElement("customer");
        writer.writeAttribute(Customer.ID, Integer.toString(customer.getId()));

        writer.writeStartElement(Customer.NAME);
        writer.writeCharacters(customer.getName());
        writer.writeEndElement(); // </name>

        writer.writeEndElement(); // </customer>
    }
}
