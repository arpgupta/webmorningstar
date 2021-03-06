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

import java.util.List;

import javax.persistence.Query;

import com.ms.entity.FeeStructure;
import com.ms.entity.StudentInfo;
import com.ms.util.MSException;

/**
 * @author Amit.Agnihotri
 *
 */




public class StudentInfoDao extends GenericDao<Integer, StudentInfo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param studentInfo
	 */
	public void save(StudentInfo studentInfo) {
		if (studentInfo.getId() == null) {
			persist(studentInfo);
		} else {
			merge(studentInfo);
		}

	}
	
	
	public List<StudentInfo> findStudentsByName(String studentName){
		Query query = getEntityManager().createQuery("Select st from StudentInfo st where st.firstName like ('"+studentName+"%')");
		@SuppressWarnings("unchecked")
		List<StudentInfo> list = query.getResultList();
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}
	public StudentInfo findStudentByRegNum(String regNum) throws Exception {
		Query query = getEntityManager().createQuery("Select st from StudentInfo st where st.regId ="+regNum);
		StudentInfo studentInfo = (StudentInfo) query.getSingleResult();
		return studentInfo;
	}

	
}