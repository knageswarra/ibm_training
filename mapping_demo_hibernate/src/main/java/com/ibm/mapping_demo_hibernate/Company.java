package com.ibm.mapping_demo_hibernate;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Entity
@Data
@Table(name="company_table")
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	@Id
	@Column(name="company_id")
	private String companyid;
	@Column(name="company_name")
	private String companyname;
	@Embedded
	private Address compaddress;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Employee> emps; 

}
