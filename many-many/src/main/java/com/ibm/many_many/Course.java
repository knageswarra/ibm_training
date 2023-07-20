package com.ibm.many_many;

import java.util.Collection;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="my_course_table")
public class Course {
	@Id
	@Column(name = "course_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "course_name")
	private String courseName;
	 @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =
	 "courses")
	 
	private Collection<Student> students;


}
