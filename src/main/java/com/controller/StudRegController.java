package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student_pojo;

public class StudRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String Studentname = request.getParameter("Studentname");
		String Fathername = request.getParameter("Fathername");
		String Mothername = request.getParameter("Mothername");
		String Gender = request.getParameter("Gender");
		String date = request.getParameter("DOB");

//1	
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

//2   
		Session session = factory.openSession();
//3
		Transaction tx = (Transaction) session.beginTransaction();

		Student_pojo st = new Student_pojo(Studentname, Fathername, Mothername, Gender, date);
//4       
		session.save(st);

//5
	 	tx.commit();
//6
		session.close();

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		out.println("Student Registred succesfully");
		out.println("<h3>");
		rd.include(request, response);
	}

}
