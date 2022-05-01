package com.rim.xmlproject.utils;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.rim.xmlproject.model.Forminfo;

public class XmlUnmarshalling {
	
	private final String xmlFilePath = "xml/test.xml";
	
    private Forminfo forminfo = null;
	
	public Forminfo getXmlData() {
		Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlData START");
		
		try {
	        InputStream ioStream = getClass().getClassLoader().getResourceAsStream(xmlFilePath);
	            
			if (ioStream == null) {
				throw new IllegalArgumentException(xmlFilePath + " is not found");
			}
			
	        JAXBContext jaxbContext = JAXBContext.newInstance(Forminfo.class);
	        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        forminfo = (Forminfo) unmarshaller.unmarshal(ioStream);

			Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "xmlFile: " + forminfo.toString());
		} catch (Exception e) {
			Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.SEVERE, "getXmlData Exception: ", e);
		}
		
		Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "getXmlData END");
		
		return forminfo;
	}

}
