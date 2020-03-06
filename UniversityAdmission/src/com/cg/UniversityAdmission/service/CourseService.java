package com.cg.UniversityAdmission.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.UniversityAdmission.model.Courses;

public interface CourseService {
	int addCourses(Courses course);

	void updateCourses(int courseId, Courses course);

	void deleteCourses(int courseId);

	List<Courses> getCourses();

	Courses searchCourses(int key);
}
