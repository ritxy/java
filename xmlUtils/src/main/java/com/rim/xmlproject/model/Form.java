package com.rim.xmlproject.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "form")
@XmlAccessorType (XmlAccessType.NONE)
public class Form {

	@XmlElement(name = "data")
	private List<Data> listOfData;

	public List<Data> getListOfData() {
		return listOfData;
	}

	public void setListOfData(List<Data> listOfData) {
		this.listOfData = listOfData;
	}

	@Override
	public String toString() {
		return "Form [listOfData=" + listOfData + "]";
	}

}
