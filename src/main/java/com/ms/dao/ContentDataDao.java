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

import com.ms.entity.ContentData;

import com.ms.util.MSException;

public class ContentDataDao  extends GenericDao<Integer, ContentData>{
	
	private static final long serialVersionUID = 1L;
	
	public void save(ContentData contantdata) {
		if (contantdata.getId() == null) {
			persist(contantdata);
		} else {
			merge(contantdata);
		}

	}
	

	@SuppressWarnings("unchecked")
	public ContentData findByStudentName(String studentname) throws MSException {
		Query jpaQuery = getEntityManager().createQuery("Select u from ContentData u where u.studentname = :studentname");
		jpaQuery.setParameter("studentname", studentname);
		List<ContentData> list = jpaQuery.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	

}









