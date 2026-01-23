package sax;


public class ReadXMLWithSAX {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		final String filename = "data/customers.xml";

        SAXCustomerHandler customerHandler = new SAXCustomerHandler();
        customerHandler.readDataFromXML(filename);
	}

}
