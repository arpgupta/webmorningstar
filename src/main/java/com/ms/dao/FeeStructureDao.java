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



public class FeeStructureDao extends GenericDao<Integer, FeeStructure> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public List<FeeStructure> findFeeForClassAndSession(Byte selClass,Byte session){
		Query query = getEntityManager().createQuery("Select x from FeeStructure x where x.className= :className and x.sessionName =:sessionName");
		query.setParameter("className", selClass);
		query.setParameter("sessionName", session);

		@SuppressWarnings("unchecked")
		List<FeeStructure> list = query.getResultList();
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	
}