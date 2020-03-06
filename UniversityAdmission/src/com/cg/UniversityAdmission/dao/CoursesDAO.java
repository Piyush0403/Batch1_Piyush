package com.cg.UniversityAdmission.dao;

import java.time.LocalDate;
import java.util.Collection;

import com.cg.UniversityAdmission.model.Courses;

public interface CoursesDAO {
	void addCourses(int courseId, Courses c);

	void updateCourse(int courseId, Courses c);

	boolean deleteCourse(int courseId);

	public Courses searchCourse(int key);

	public Collection<Courses> getCourse();

}
