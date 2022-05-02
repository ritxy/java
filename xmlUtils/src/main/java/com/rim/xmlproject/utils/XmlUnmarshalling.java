package com.rim.xmlproject.utils;

import java.io.InputStream;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.rim.xmlproject.model.Forminfo;

public class XmlUnmarshalling {
	
	private static final String XML_FILE_PATH = "xml/test.xml";
	
    private Forminfo forminfo = null;
	
    /**
     * Method to convert a file with a XML to Java Objects
     * @return Class with the elements of the XML
     */
	public Forminfo getXmlDataFromFile() {
		Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlDataFromFile START");
		
		try {
	        InputStream ioStream = getClass().getClassLoader().getResourceAsStream(XML_FILE_PATH);
	            
			if (ioStream == null) {
				throw new IllegalArgumentException(XML_FILE_PATH + " is not found");
			}
			
	        JAXBContext jaxbContext = JAXBContext.newInstance(Forminfo.class);
	        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        forminfo = (Forminfo) unmarshaller.unmarshal(ioStream);

			Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlDataFromFile, xmlFile: {0}", forminfo);
		} catch (Exception e) {
			Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.SEVERE, "getXmlDataFromFile Exception: ", e);
		}
		
		Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlDataFromFile END");
		
		return forminfo;
	}
	
	/**
	 * Method to convert a string with XML to Java Objects
	 * @param xmlString String with the XML
	 * @return Class with the elements of the XML
	 */
	public Forminfo getXmlDataFromString(String xmlString) {
		Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlDataFromString START");
		
		try {
			Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlDataFromString, xmlString: {0}", xmlString);
			
	        JAXBContext jaxbContext = JAXBContext.newInstance(Forminfo.class);
	        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        forminfo = (Forminfo) unmarshaller.unmarshal(new StringReader(xmlString));

			Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlDataFromString, xmlFile {0}", forminfo);
		} catch (Exception e) {
			Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.SEVERE, "getXmlDataFromString Exception: ", e);
		}
		
		Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlDataFromString END");
		
		return forminfo;
	}	

}
