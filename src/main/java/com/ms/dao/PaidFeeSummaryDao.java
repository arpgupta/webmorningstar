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

package com.ms.dao;

import java.util.List;

import javax.persistence.Query;

import com.ms.entity.PaidFeeSummary;
import com.ms.entity.User;
import com.ms.util.MSException;



public class PaidFeeSummaryDao extends GenericDao<Integer, PaidFeeSummary> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void save(PaidFeeSummary paidFeeSummary) {
		if (paidFeeSummary.getId() == null) {
			persist(paidFeeSummary);
		} else {
			merge(paidFeeSummary);
		}

	}
	
	
	@SuppressWarnings("unchecked")
	public PaidFeeSummary findByStudentId(Integer studentId) throws MSException {
		Query jpaQuery = getEntityManager().createQuery("Select fs from PaidFeeSummary fs where fs.studentId = :studentId");
		jpaQuery.setParameter("studentId", studentId);
		List<PaidFeeSummary> list = jpaQuery.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	
	
	
}