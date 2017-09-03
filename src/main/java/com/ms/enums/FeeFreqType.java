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
public enum FeeFreqType {
	ANUALLY ((byte)1,"Anually"),
	HALFYEARLY((byte)2,"Half Yearly"),
	QUARTERLY((byte)3,"Quarterly"),
	MONTHLY ((byte)4,"Monthly");
	
	
	private Byte code;
	private String name;
	
	/**
	 * 
	 */
	private FeeFreqType(Byte code,String name) {
		this.code = code;
		this.name = name;
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
