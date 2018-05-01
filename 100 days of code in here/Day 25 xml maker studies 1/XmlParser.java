package application;

//this is tester code for creating a 
//xml document in java, this will be used later to store 
//values from the gui

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

//root bookName
// element author
//element ID number
//element price
public class XmlParser 
{

	public static void main(String[] args) 
	{
			try
			{
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.newDocument();
				
				//root element
				Element rootElement = doc.createElement("camera");
				doc.appendChild(rootElement);
				
				//Supercars element 
				Element cameraPosition = doc.createElement("position");
				rootElement.appendChild(cameraPosition);
				
				Attr camXAttr = doc.createAttribute("x");
				camXAttr.setValue("0.3542");
				cameraPosition.setAttributeNode(camXAttr);
				cameraPosition.appendChild(doc.createTextNode("text node"));
				
				
//				cameraPosition.appendChild(doc.createTextNode("900.8234"));
				//setting atrribute to element
//				Attr camXattr = doc.createAttribute("x");
//				camXattr.setValue("0.89234");
//				cameraPosition.setAttributeNode(camXattr);
				
//				Element camXelem = doc.createElement("camPosX");
//				Attr camXAttr = doc.createAttribute("camXpos");
//				camXAttr.setValue("0.3542");
//				cameraPosition.setAttributeNode(camXAttr);
				
			
				
				
				//setting atrribute to element
//				Attr camYattr = doc.createAttribute("y");
//				camYattr.setValue("10.8325434");
//				cameraPosition.setAttributeNode(camYattr);
				
				// carname element
//				Element carName = doc.createElement("carname");
//				Attr attrType = doc.createAttribute("boo");
//				attrType.setValue("formula one");
//				carName.setAttributeNode(attrType);
//				carName.appendChild(doc.createTextNode("Ferrarai 101"));
//				cameraPosition.appendChild(carName);
				
				//write content into an xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				//to get rid of xml declaration
				//transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(System.out);
				transformer.transform(source, result);
				
				//output to console for testing
				System.out.println("");
				System.out.println("");
				transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
				StreamResult consoleResult = new StreamResult(System.out);
				transformer.transform(source, consoleResult);
				
				System.out.println("");
			
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				
			}
		
		
	}
}
		
		


	
		
		
		
		
		
	

	

