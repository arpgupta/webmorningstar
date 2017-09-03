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

import com.ms.entity.Payment;




public class PaymentDao extends GenericDao<Integer, Payment> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void save(Payment payment) {
		if (payment.getId() == null) {
			persist(payment);
		} else {
			merge(payment);
		}

	}
	

	public Payment findByStudentId(Integer studentId,Byte feeType) {
		Payment payment = null;
		Query jpaQuery = getEntityManager().createQuery("Select p from Payment p where p.studentId = "+studentId + " and p.feeType = "+feeType);
		try {
			payment = (Payment) jpaQuery.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return payment;

	}
	

}