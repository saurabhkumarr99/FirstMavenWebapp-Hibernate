package com.model;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import antlr.collections.List;

public class fetchData {

	// public static void main(String[] args) {
	public static ArrayList<Student_pojo> fetchData() {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		String query = "from Student_pojo";
		Query q = session.createQuery(query);
		ArrayList<Student_pojo> list = (ArrayList<Student_pojo>) q.list();
		
		session.close();
		factory.close();
		return list;
	}

}
