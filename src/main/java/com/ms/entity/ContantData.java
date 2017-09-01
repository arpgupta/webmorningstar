package com.ms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "dashboard")
public class ContantData  extends BaseEntity<Integer> implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "studentname")
	private String studentname;


	@Column(name = "studentdescription")
	private String studentdescription;
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


	public String getStudentdescription() {
		return studentdescription;
	}


	public void setStudentdescription(String studentdescription) {
		this.studentdescription = studentdescription;
	}


	private static final long serialVersionUID = 1L;

	
	
	
	
	
	
}
