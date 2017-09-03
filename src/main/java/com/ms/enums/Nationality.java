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
public enum Nationality {
	


	INDIAN ((byte)1,"Indian"),
	NRI((byte)2,"NRI");
	
	
	private Byte code;
	private String name;
	
	private Nationality(Byte code,String name) {
		this.code = code;
		this.name = name;
	}

	
	public static Byte findCodeByName(String  name){
		for(Nationality nationality : Nationality.values()){
			if(nationality.name.equals(name)){
				return nationality.code;
			}
		}
		return null;
	}
	
	public static String findNameByCode(Byte  code){
		for(Nationality nationality : Nationality.values()){
			if(nationality.code.byteValue() == code.byteValue()){
				return nationality.name;
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
