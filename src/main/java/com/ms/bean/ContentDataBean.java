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
package com.ms.bean;

import java.util.List;

import com.ms.entity.ContentData;
import com.ms.enums.Content;
import com.ms.enums.Section;



public class ContentDataBean {
	
	private int tempeditId=0;
	private int tempdeleteId=0;

	private int id;



	private String StudentName;

	private String StudentDescription;
	
	private String ClassName;
	
	private List<ContentData> contentData;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getTempeditId() {
		return tempeditId;
	}

	public void setTempdeleteId(int tempdeleteId) {
		this.tempdeleteId = tempdeleteId;
	}
	
	public void setTempeditId(int tempeditId) {
		this.tempeditId = tempeditId;
	}

	public int getTempdeleteId() {
		return tempdeleteId;
	}


	public List<ContentData> getContentData() {
		return contentData;
	}

	public void setContentData(List<ContentData> contentData) {
		this.contentData = contentData;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentDescription() {
		return StudentDescription;
	}

	public void setStudentDescription(String studentDescription) {
		StudentDescription = studentDescription;
	}
}
