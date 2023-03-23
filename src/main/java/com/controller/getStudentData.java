package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student_pojo;
import com.model.fetchData;

/**
 * Servlet implementation class getStudentData
 */
public class getStudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String val = (request.getParameter("name"));
		String by = request.getParameter("search");

//1
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//2
		Session session = factory.openSession();

		// Student_pojo student =session.get(Student_pojo.class, Id);
		String query = "from Student_pojo where " + by + "=:x";

		Query q = session.createQuery(query);
		if (by.equals("id")) {
			q.setParameter("x", Integer.valueOf(val));
		} else {
			q.setParameter("x", val);
		}
//4		
		ArrayList<Student_pojo> list = (ArrayList<Student_pojo>) q.list();

//6		
		session.close();
		factory.close();

		RequestDispatcher rd = request.getRequestDispatcher("searchStudent.jsp");
		request.setAttribute("student", list);
		rd.include(request, response);
	}

}
