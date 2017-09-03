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
package com.ms.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtil {
	
	
	public static String md5Encrypt(String password)throws MSException{
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update((password+MSConstant.SALT).getBytes());
			byte byteData[] = md.digest();
			StringBuffer hexString = new StringBuffer();
			for (int i=0;i<byteData.length;i++) {
				String hex=Integer.toHexString(0xff & byteData[i]);
			 	if(hex.length()==1) hexString.append('0');
			 	hexString.append(hex);
			}
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new MSException(e);
		}
	}

}
