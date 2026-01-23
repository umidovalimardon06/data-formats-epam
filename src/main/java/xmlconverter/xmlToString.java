package xmlconverter;

import java.io.FileReader;

public class xmlToString {
    public static void main(String[] args) throws Exception {
        final String filename = "data/customers.xml";
        FileReader reader = new FileReader(filename);
        StringBuilder builder = new StringBuilder();

        int content;
        while ((content = reader.read()) != -1) {
            builder.append((char)content);
        }

        reader.close();
        System.out.println(builder.toString());
    }

}
