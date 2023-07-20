package com.ibm.hibernate_3.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import javax.persistence.InheritanceType;
import lombok.Data;

@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CD {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cdId;
	private String cdName;
	public CD(String cdName) {
		super();
		this.cdName = cdName;
	}
}
