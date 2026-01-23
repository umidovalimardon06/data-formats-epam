package sax;


import java.util.List;

public class ReadXMLWithSAX {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		final String filename = "data/customers.xml";

        SAXCustomerHandler customerHandler = new SAXCustomerHandler();
        List<Customer> customers = customerHandler.readDataFromXML(filename);
        System.out.println("Number of customers: "+customers.size());
    }

}
