package com.model;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class crud {
//1	
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//2	
	Session session = factory.openSession();

	public String delete(int id) {
		Student_pojo student = session.get(Student_pojo.class, id);
//3
		Transaction tx = (Transaction) session.beginTransaction();

		String query = "delete from Student_pojo where id=:x";

		Query q = session.createQuery(query);
		q.setParameter("x", id);
//4	
		q.executeUpdate();
//5	
		tx.commit();
//6		
		session.close();
		return (student.toString() + "deleted");
	}

	public String update(int id, String sname, String fname, String mname, String gender, String dob) {
		Student_pojo student = session.get(Student_pojo.class, id);
//3
		Transaction tx = (Transaction) session.beginTransaction();
		String query = "update  Student_pojo set Student_Name =:s ,father_Name=:f, Mother_Name=:m, Gender=:g ,DOB=:d where id=:x";
		Query q = session.createQuery(query);
		q.setParameter("x", id);
		q.setParameter("s", sname);
		q.setParameter("f", fname);
		q.setParameter("m", mname);
		q.setParameter("g", gender);
		q.setParameter("d", dob);
//4
		q.executeUpdate();
//5
		tx.commit();
//6
		session.close();
		return (student.toString() + "updated");
	}

}
