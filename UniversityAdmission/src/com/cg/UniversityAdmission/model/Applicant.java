package com.cg.UniversityAdmission.model;

import java.time.LocalDate;

public class Applicant
{
	private String city;
	private String name;
	private int age;
	private String mobile;
	private String email;
	private Courses course;
	private int appid;
	private LocalDate dob;
	private int marks;
	private Status status;
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public enum Status
	{
		Confirmed,Rejected,Pending;
	}
	
	public Applicant()
	{
		
	}

	public int getAppid() {
		return appid;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setAppid(int appid) {
		this.appid = appid;
	}

		
	public Courses getCourse() {
		return course;
	}

	public void setCourses(Courses course) {
		this.course = course;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Applicant [city=" + city + ", name=" + name + ", age=" + age + ", mobile=" + mobile + ", email=" + email
				+ ", course=" + course + ", appid=" + appid + ", dob=" + dob + ", marks=" + marks
				+ "]";
	}
	
	

}
