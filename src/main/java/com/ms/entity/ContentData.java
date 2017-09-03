/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
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
@Table(name = "contentdata")
public class ContentData  extends BaseEntity<Integer> implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "studentname")
	private String studentname;
	
	@Column(name = "classname")
	private String classname;


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


	public String getClassname() {
		return classname;
	}


	public void setClassname(String classname) {
		this.classname = classname;
	}


	public String getStudentdescription() {
		return studentdescription;
	}


	public void setStudentdescription(String studentdescription) {
		this.studentdescription = studentdescription;
	}


	private static final long serialVersionUID = 1L;

	
	
	
	
	
	
}
