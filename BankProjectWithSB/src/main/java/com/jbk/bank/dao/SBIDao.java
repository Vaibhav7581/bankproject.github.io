package com.jbk.bank.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.bank.entity.SBIBank;

@Repository
public class SBIDao {
	@Autowired
	SessionFactory factory;

	public List<SBIBank> getAllCustomersData() {
		Session openSession = factory.openSession();
		Criteria createCriteria = openSession.createCriteria(SBIBank.class);
		return createCriteria.list();

	}

	public String insertCustomersData(List<SBIBank> cuslist) {
		Session openSession = factory.openSession();
		Transaction tr = openSession.beginTransaction();
		for (SBIBank sbiBank : cuslist) {
			openSession.save(sbiBank);
		}
		tr.commit();
		return "Data inserted into the Project Successfully";
	}

	public String upadteCustomersData(List<SBIBank> cuslist) {
		Session openSession = factory.openSession();
		Transaction tr = openSession.beginTransaction();
		for (SBIBank sbiBank : cuslist) {
			openSession.update(sbiBank);
		}
		tr.commit();
		return "Data updated into the Project Successfully";
	}

	public String deleteCustomersData(int id) {
		Session openSession = factory.openSession();
		Transaction tr = openSession.beginTransaction();
		SBIBank sbiBank = openSession.get(SBIBank.class, id);
		openSession.delete(sbiBank);
		tr.commit();
		return "Data deleted from the Project Successfully";
	}

	public List<SBIBank> getCustomersDataByID(int id) {
		Session openSession = factory.openSession();
		Criteria criteria = openSession.createCriteria(SBIBank.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public SBIBank getCustomersDataByID1(int id1) {
		Session openSession = factory.openSession();
		SBIBank sbiBank = openSession.get(SBIBank.class, id1);
		return sbiBank;
	}
}
