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

import com.ms.entity.FeeSlip;
import com.ms.entity.StudentReg;
import com.ms.util.MSException;

/**
 * @author Amit.Agnihotri
 *
 */





public class StudentRegDao extends GenericDao<Integer, StudentReg> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param studentReg
	 */
	public void save(StudentReg studentReg) {
		if (studentReg.getId() == null) {
			persist(studentReg);
		} else {
			merge(studentReg);
		}

	}
	
	public StudentReg findIdByNumber(String regNumber) throws MSException {
		Query jpaQuery = getEntityManager().createQuery("Select r from StudentReg r where r.regNumber = "+regNumber);
		StudentReg studentReg = (StudentReg) jpaQuery.getSingleResult();
		return studentReg;
		
	}

	
}