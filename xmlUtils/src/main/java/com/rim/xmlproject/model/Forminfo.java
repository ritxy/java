package com.rim.xmlproject.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "forminfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Forminfo {
	@XmlElement
	private String id;
	
	@XmlElement(name="form")
	private Form form;
	
	
	@XmlElement(name="person")
	private Person person;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}





	public Forminfo() {

	}

	public Forminfo(String id) {
		this.id = id;
	}
	
	public Forminfo(String id, Person person) {
		this.id = id;
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	@Override
	public String toString() {
		return "Forminfo [id=" + id + ", form=" + form + ", person=" + person + "]";
	}




}
