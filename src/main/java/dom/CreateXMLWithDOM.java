package dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;

public class CreateXMLWithDOM {
    public static void main(String[] args) throws ParserConfigurationException {
        DOMCreator creator = new DOMCreator();
        Document doc = creator.createXMLDoc();

        System.out.println(doc.toString());

        Node root = doc.getFirstChild();
        System.out.println(root.getNodeName());
    }

}
