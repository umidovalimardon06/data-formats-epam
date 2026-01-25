package stax;

import java.util.List;

//import dataprovider.DataProvider;
import stax.dataprovider.DataProvider;
import stax.model.Customer;

import javax.xml.stream.XMLStreamException;

public class CreateXMLWithStAX {

	public static void main(String[] args) throws XMLStreamException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);
		
		stax.StAXStreamCreator creator = new stax.StAXStreamCreator();
		creator.createDocument(data, "./output/customers.xml");
		
	}
}
