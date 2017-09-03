package com.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ms.dao.ContentDataDao;
import com.ms.entity.ContentData;
import com.ms.util.MSException;


public class ContentDataService {

	/*@Autowired
	private ContentDataDao contentDataDao;*/
	
	@Transactional(rollbackFor = Exception.class)
	public void saveData(ContentData contentData)
	{
		ContentDataDao contentDataDao=new ContentDataDao();
		contentDataDao.save(contentData);
	}
	
/*public ContentData getStudentByStudentName(String name)
{
	ContentData obj=new ContentData();
	try {
		obj = contentDataDao.findByStudentName(name);
	} catch (MSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return obj;
}
*/}
