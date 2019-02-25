package com.formafast.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.formafast.entities.Test;

public class PersonneDaoImpl implements ITest {

	@Override
	public void ajouter(Test p) {
		// TODO Auto-generated method stub
		Session s = DBSession.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();
		s.close();

	}

	@Override
	public void modifier(Test p) {
		// TODO Auto-generated method stub
		Session s = DBSession.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		s.update(p);
		tx.commit();
		s.close();
	}

	@Override
	public void supprimer(Test p) {
		// TODO Auto-generated method stub
		Session s = DBSession.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		s.delete(p);
		tx.commit();
		s.close();
	}

}
