package com.ibm.hibernate_3.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employee_table")

public class Employee {
	@Id
	@Column(name="emp_id")
    private int empid;
	@Column(name="emp_name")
    private String name;
	@Column(name="salary")
    private double sal;
	//uni directional one to one mapping
	@OneToOne(cascade=CascadeType.ALL)
    private Department dept;
	
}
