package dom;

import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XMLPrinter {
    public void printXML() throws ParserConfigurationException, TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();

        // optional formatting
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");

        DOMCreator creator = new DOMCreator();
        Document doc = creator.createXMLDoc();

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(System.out);

        transformer.transform(source, result);
    }
}
