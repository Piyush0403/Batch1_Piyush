package com.cg.UniversityAdmission.model;

import java.time.LocalDate;

public class Courses {
	private int courseId;
	private LocalDate startDate;
	private LocalDate endDate;
	private String courseName;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", startDate=" + startDate + ", endDate=" + endDate + ", courseName="
				+ courseName + "]";
	}

}
