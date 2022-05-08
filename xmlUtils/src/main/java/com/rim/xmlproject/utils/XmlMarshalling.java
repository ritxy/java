package com.rim.xmlproject.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.rim.xmlproject.model.Data;
import com.rim.xmlproject.model.Form;
import com.rim.xmlproject.model.Forminfo;
import com.rim.xmlproject.model.Person;

public class XmlMarshalling {
	private static final String FILE_PATH = "src/main/resources/xml/forminfoGenerated.xml";

	public void marshalling() {
		Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "marshalling START");

		try {
			Forminfo forminfo = createForminfo();

			JAXBContext jaxbContext = JAXBContext.newInstance(forminfo.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(forminfo, new File(FILE_PATH));
		} catch (JAXBException ex) {
			Logger.getLogger(XmlMarshalling.class.getName()).log(Level.SEVERE, null, ex);
		}

		Logger.getLogger(XmlUnmarshalling.class.getName()).log(Level.INFO, "marshalling END");
	}

	private Forminfo createForminfo() {
		Forminfo forminfo = new Forminfo();

		forminfo.setId("1");
		forminfo.setPerson(createPerson());
		forminfo.setForm(createForm());

		return forminfo;
	}

	private Person createPerson() {
		Person person = new Person();

		person.setCellphone("345123789");
		person.setCity("Boston");
		person.setName("John");
		person.setSurname("Doe");
		person.setZipcode("12345");

		return person;
	}

	private Form createForm() {
		Form form = new Form();
		List<Data> listOfData = new ArrayList<>();

		for (int i = 0; i <= 7; i++) {
			Data data = new Data();

			data.setType(String.valueOf(i));

			if (i % 2 == 0) {
				data.setOn("on");
			} else {
				data.setOn("off");
			}

			listOfData.add(data);
		}

		form.setListOfData(listOfData);

		return form;
	}

}
