package baseDatos;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainSAX {

	public static void main(String[] args) throws SAXException {
		
		XMLReader reader = XMLReaderFactory.createXMLReader();
		
		ParserLibroXML parserLibro = null;
		parserLibro = new ParserLibroXML();
		
		reader.setContentHandler(parserLibro);
		
		
		
		
		
	}	
}
