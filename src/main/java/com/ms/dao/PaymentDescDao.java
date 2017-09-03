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

import com.ms.entity.PaymentDesc;



public class PaymentDescDao extends GenericDao<Integer, PaymentDesc> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void save(PaymentDesc paymentDesc) {
		if (paymentDesc.getId() == null) {
			persist(paymentDesc);
		} else {
			merge(paymentDesc);
		}
	}
	
}