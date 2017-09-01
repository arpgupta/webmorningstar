package com.ms.dao;


import java.util.List;

import javax.persistence.Query;

import com.ms.entity.ContantData;
import com.ms.entity.PaidFeeSummary;
import com.ms.entity.User;
import com.ms.util.MSException;

public class ContentDataDao  extends GenericDao<Integer, ContantData>{
	
	private static final long serialVersionUID = 1L;
	
	public void save(ContantData contantdata) {
		if (contantdata.getId() == null) {
			persist(contantdata);
		} else {
			merge(contantdata);
		}
		
		

	}
	

	@SuppressWarnings("unchecked")
	public ContantData findByStudentName(String studentname) throws MSException {
		Query jpaQuery = getEntityManager().createQuery("Select u from ContantData u where u.studentname = :studentname");
		jpaQuery.setParameter("studentname", studentname);
		List<ContantData> list = jpaQuery.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	

}









