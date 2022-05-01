package com.rim.xmlproject.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.NONE)
public class Data {
	@XmlElement(name = "type")
	private String type;

	@XmlElement(name = "on")
	private String on;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOn() {
		return on;
	}

	public void setOn(String on) {
		this.on = on;
	}

	@Override
	public String toString() {
		return "Data [type=" + type + ", on=" + on + "]";
	}

}
