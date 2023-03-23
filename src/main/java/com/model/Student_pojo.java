package com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Student_data")
public class Student_pojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Student_Name")
	private String Student_Name;
	
	@Column(name = "Father_Name")
	private String father_Name;
	
	@Column(name = "Mother_Name")
	private String mother_Name;
	
	@Column(name = "Gender")
	private String Gender;
	private String DOB;
	
	
	public Student_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student_pojo(String student_Name, String father_Name, String mother_Name, String gender, String dOB) {
		super();
		Student_Name = student_Name;
		this.father_Name = father_Name;
		this.mother_Name = mother_Name;
		Gender = gender;
		DOB = dOB;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStudent_Name() {
		return Student_Name;
	}


	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}


	public String getFather_Name() {
		return father_Name;
	}


	public void setFather_Name(String father_Name) {
		this.father_Name = father_Name;
	}


	public String getMother_Name() {
		return mother_Name;
	}


	public void setMother_Name(String mother_Name) {
		this.mother_Name = mother_Name;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	@Override
	public String toString() {
		return "Student_pojo [id=" + id + ", Student_Name=" + Student_Name + ", father_Name=" + father_Name
				+ ", mother_Name=" + mother_Name + ", Gender=" + Gender + ", DOB=" + DOB + "]";
	}
	
	
	
}
