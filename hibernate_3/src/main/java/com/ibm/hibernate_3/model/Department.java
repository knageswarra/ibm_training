package com.ibm.hibernate_3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="department_table")
@Data
public class Department {
		@Id
		@Column(name="id")
	    private int id;
		@Column(name="department_name")
        private String departmentname;
		@Column(name="loaction")
        private String location;

	

	 

}
