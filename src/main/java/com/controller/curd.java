package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student_pojo;
import com.model.crud;

public class curd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		crud crud = new crud();
		String button = request.getParameter("button");
		int id = (Integer.valueOf(request.getParameter("id")));
		String res = null;
		if ("delete".equals(button)) {
			res = crud.delete(id);
		} else if ("update".equals(button)) {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = factory.openSession();
			Student_pojo student = session.get(Student_pojo.class, id);

			student.setStudent_Name(null);
			student.setFather_Name(null);
			student.setMother_Name(null);
			student.setDOB(null);
			student.setGender(null);
			res = crud.update(id,student.getStudent_Name(), student.getFather_Name(), student.getMother_Name(),
					student.getGender(), student.getDOB() );
		}

		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		out.println(res);
		rd.include(request, response);
	}

}
