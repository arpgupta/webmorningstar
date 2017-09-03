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
package com.ms.service;

/**
 * @author Amit.Agnihotri
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.dao.PaymentDao;
import com.ms.entity.Payment;

/**
 * @author Amit.Agnihotri
 *
 */
@Service
public class PaymentService {
	
	@Autowired	
	public PaymentDao paymentDao;

	@Transactional(rollbackFor = Exception.class)
	public void save(Payment payment){
		paymentDao.save(payment);
	}

	public Payment findByStudentId(Integer studentId,Byte feeType) {
		return paymentDao.findByStudentId(studentId, feeType);
	}


	
}
