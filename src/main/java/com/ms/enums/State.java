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
public enum State {

	
	UTTARPRADESH ((byte)1,"Uttar Pradesh"),
	HARYANA((byte)2,"Haryana"),
	MADHYAPRADESH((byte)2,"Madhya Pradesh"),
	BIHAR((byte)3,"Bihar");
	
	/**
	 * 
	 */
	private Byte code;
	private String name;
	
	private State(Byte code,String name) {
		this.code = code;
		this.name = name;
	}

	
	public static Byte findCodeByName(String  name){
		for(State state : State.values()){
			if(state.name.equals(name)){
				return state.code;
			}
		}
		return null;
	}
	
	public static String findNameByCode(Byte  code){
		for(State state : State.values()){
			if(state.code.byteValue() == code.byteValue()){
				return state.name;
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
