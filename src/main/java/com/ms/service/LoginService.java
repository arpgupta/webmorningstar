/*******************************************************************************
* Copyright (c) 2016 PWC Corporation and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the PWC License v1.0
*
* Contributors:
* PWC - initial API and implementation
*******************************************************************************/
/**
 * 
 */
package com.ms.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.bean.Login;
import com.ms.dao.ContentDataDao;
import com.ms.dao.UserDao;
import com.ms.entity.ContantData;
import com.ms.entity.User;
import com.ms.util.EncryptionUtil;
import com.ms.util.MSException;



/**
 * @author Apple
 *
 */

@Service
public class LoginService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ContentDataDao contentDataDao;


	/**
	 * @param login
	 * @return
	 * @throws PwcException
	 */
	public User authenticate(Login login) throws MSException {
		return userDao.findByEmailAndPassword(login.getEmail(), EncryptionUtil.md5Encrypt(login.getPassword()));

	}
	
	@Transactional(rollbackFor = Exception.class)
	public void saveData(ContantData contantData)
	{
		//ContentDataDao contentDataDao=new ContentDataDao();
		contentDataDao.save(contantData);
	}
	
public ContantData getStudentByStudentName(String name)
{
	ContantData obj=new ContantData();
	try {
		obj = contentDataDao.findByStudentName(name);
	} catch (MSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return obj;
}

}
