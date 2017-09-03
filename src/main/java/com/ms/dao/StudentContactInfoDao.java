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
/**
 * 
 */
package com.ms.dao;

import javax.persistence.Query;

/**
 * @author Amit.Agnihotri
 *
 */

import com.ms.entity.StudentContactInfo;
import com.ms.entity.StudentInfo;



public class StudentContactInfoDao extends GenericDao<Integer, StudentContactInfo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param studentContactInfo
	 */
	public void save(StudentContactInfo studentContactInfo) {
		if (studentContactInfo.getId() == null) {
			persist(studentContactInfo);
		} else {
			merge(studentContactInfo);
		}

	}
	
	public StudentContactInfo findStudentContactInfoByStudentId(Integer studentId) {
		Query query = getEntityManager().createQuery("Select st from StudentContactInfo st where st.studentId ="+studentId);
		StudentContactInfo studentContactInfo = (StudentContactInfo) query.getSingleResult();
		return studentContactInfo;
	}
}