package com.rim.xmlproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rim.xmlproject.utils.XmlUnmarshalling;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		XmlUnmarshalling unmarshallingFromFile = new XmlUnmarshalling();
		unmarshallingFromFile.getXmlDataFromFile();
		
		XmlUnmarshalling unmarshallingFromString = new XmlUnmarshalling();
		unmarshallingFromString.getXmlDataFromString("<forminfo> <id>1</id> <form> <data> <type>A</type> <on>true</on> </data> <data> <type>B</type> <on>false</on> </data> <data> <type>C</type> <on/> </data> </form> <person> <name>Name</name> <surname>Surname</surname> <address>Street 123</address> <phone>123 456 789</phone> <zipcode></zipcode> <cellphone/> <city>New York</city> </person> </forminfo>");
	}

}
