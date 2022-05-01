package com.rim.xmlproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rim.xmlproject.utils.XmlUnmarshalling;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		XmlUnmarshalling a = new XmlUnmarshalling();
		a.getXmlData();
	}

}
