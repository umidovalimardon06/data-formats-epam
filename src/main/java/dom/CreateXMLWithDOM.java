package dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class CreateXMLWithDOM {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        DOMCreator creator = new DOMCreator();
        Document doc = creator.createXMLDoc();

        Node root = doc.getFirstChild();
        System.out.println("root-node: "+root.getNodeName());

        XMLPrinter printer = new XMLPrinter();
        printer.printXML();
    }

}
