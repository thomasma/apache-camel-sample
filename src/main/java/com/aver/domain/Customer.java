package com.aver.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@SuppressWarnings("serial")
@Component("customer")
@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("customer")
public class Customer implements Serializable {
	@XmlAttribute(name = "id")
	@XStreamAlias("id")
	private String id;

	@XmlAttribute(name = "name")
	@XStreamAlias("name")
	private String name;

	@XmlAttribute(name = "streetAddress")
	@XStreamAlias("streetAddress")
	private String streetAddress;

	@XmlAttribute(name = "state")
	@XStreamAlias("state")
	private String state;

	@XmlAttribute(name = "city")
	@XStreamAlias("city")
	private String city;

	@XmlAttribute(name = "type")
	@XStreamAlias("type")
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private List<Rebate> rebates = new ArrayList<Rebate>();

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void applyRebate() {
	}

	public void addRebate(Rebate rebate) {
		if (rebate != null) {
			rebates.add(rebate);
		}
	}

	public List<Rebate> getRebates() {
		return rebates;
	}

	public String getCustId() {
		return id;
	}

	public void setCustId(String custId) {
		this.id = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return streetAddress;
	}

	public void setAddress(String address) {
		this.streetAddress = address;
	}

	public String toString() {
		return "Name="
				+ name
				+ ", Rebate="
				+ (rebates.size() > 0 ? rebates.get(0).toString() : "norebates");

	}
}
