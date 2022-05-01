package com.rim.xmlproject.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
@XmlAccessorType (XmlAccessType.NONE)
public class Person {

	@XmlElement(name="name")
	private String name;
	@XmlElement(name="surname")
	private String surname;
	@XmlElement(name="phone")
	private String phone;
	@XmlElement(name="zipcode")
	private String zipcode;
	@XmlElement(name="cellphone")
	private String cellphone;
	@XmlElement(name="city")
	private String city;


	public String getName() {
		return name;
	}

	public Person() {

	}

//	public Person(String name) {
//
//		this.name = name;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", phone=" + phone + ", zipcode=" + zipcode
				+ ", cellphone=" + cellphone + ", city=" + city + "]";
	}

}
