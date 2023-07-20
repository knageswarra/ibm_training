package com.ibm.hibernate_3.model;

import javax.persistence.Entity;

import lombok.Setter;

@Setter
@Entity
public class SpecialCD extends CD{

	private String feature;
	public SpecialCD(String cdName, String feature) {
		super(cdName);
		// TODO Auto-generated constructor stub
		this.feature = feature;
	}

}
