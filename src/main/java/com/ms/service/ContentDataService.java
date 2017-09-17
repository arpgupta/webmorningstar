package com.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.dao.ContentDataDao;
import com.ms.entity.ContentData;
import com.ms.util.MSException;

@Service
public class ContentDataService {

	@Autowired
	private ContentDataDao contentDataDao;
	
	
	@Transactional(rollbackFor = Exception.class)
	public void saveData(ContentData contentData)
	{
		//ContentDataDao contentDataDao=new ContentDataDao();
		contentDataDao.save(contentData);
	}
	
public ContentData getStudentById(int id)
{
	ContentData obj=new ContentData();
	try {
		obj = contentDataDao.findById(id);
	} catch (MSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return obj;
}
public ContentData deletStudentById(int id)
{
	ContentData obj=new ContentData();
	try {
		obj = contentDataDao.deleteStudentById(id);
	} catch (MSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return obj;
}
	
	public List<ContentData> findStudentData() throws MSException {
		
		return contentDataDao.findStudentData();
	}
}
