package com.ms.dao;


import java.util.List;

import javax.persistence.Query;

import com.ms.entity.ContentData;

import com.ms.util.MSException;

public class ContentDataDao  extends GenericDao<Integer, ContentData>{
	
	private static final long serialVersionUID = 1L;
	
	public void save(ContentData contantdata) {
		if (contantdata.getId() == null) {
			persist(contantdata);
		} else {
			merge(contantdata);
		}

	}
	

	@SuppressWarnings("unchecked")
	public ContentData findByStudentName(String studentname) throws MSException {
		Query jpaQuery = getEntityManager().createQuery("Select u from ContentData u where u.studentname = :studentname");
		jpaQuery.setParameter("studentname", studentname);
		List<ContentData> list = jpaQuery.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	

}









