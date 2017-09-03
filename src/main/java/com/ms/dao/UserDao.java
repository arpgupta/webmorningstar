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

import com.ms.entity.User;
import com.ms.util.MSException;



public class UserDao extends GenericDao<Integer, User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public User findByEmailAndPassword(String email, String password) throws MSException {
		Query jpaQuery = getEntityManager().createQuery("Select u from User u where u.email = :email and u.password = :password and u.status=1");
		jpaQuery.setParameter("email", email);
		jpaQuery.setParameter("password", password);
		List<User> list = jpaQuery.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
}
