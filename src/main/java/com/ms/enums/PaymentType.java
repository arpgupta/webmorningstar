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
package com.ms.enums;

/**
 * @author Amit.Agnihotri
 *
 */
public enum PaymentType {
	CASH ((byte)1,"Cash"),
	CHEQUEDD((byte)2,"Cheque/DD"),
	BANKDEPOSIT((byte)3,"Bank Deposit");
	
	
	private Byte code;
	private String name;
	
	private PaymentType(Byte code,String name) {
		this.code = code;
		this.name = name;
	}

	
	public static Byte findCodeByName(String  name){
		for(PaymentType paymentType : PaymentType.values()){
			if(paymentType.name.equals(name)){
				return paymentType.code;
			}
		}
		return null;
	}
	
	public static String findNameByCode(Byte  code){
		for(PaymentType paymentType : PaymentType.values()){
			if(paymentType.code.byteValue() == code.byteValue()){
				return paymentType.name;
			}
		}
		return null;
	}
	/**
	 * @return the code
	 */
	public Byte getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Byte code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
