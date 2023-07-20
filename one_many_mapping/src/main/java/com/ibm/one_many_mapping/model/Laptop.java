package com.ibm.one_many_mapping.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="laptoptable")
public class Laptop {
	@Id
  private int lid;
  private  String lname;
  @ManyToOne(cascade=CascadeType.ALL)
  private Student stud;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public Student getStud() {
	return stud;
}
public void setStud(Student stud) {
	this.stud = stud;
}
  
}
