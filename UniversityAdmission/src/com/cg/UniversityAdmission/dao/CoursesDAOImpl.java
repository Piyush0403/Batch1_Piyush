package com.cg.UniversityAdmission.dao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;

import com.cg.UniversityAdmission.model.Courses;

public class CoursesDAOImpl implements CoursesDAO {

	private HashMap<Integer, Courses> courses;

	@Override
	public void addCourses(int courseId, Courses course) {
		// TODO Auto-generated method stub
		courses.put(courseId, course);
	}

	@Override
	public boolean deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		Courses course = courses.remove(courseId);
		return course != null ? true : false;
	}

	@Override
	public Courses searchCourse(int key) {
		// TODO Auto-generated method stub
		return courses.get(key);
	}

	@Override
	public Collection<Courses> getCourse() {
		Collection<Courses> list = courses.values();
		return list;
	}

	@Override
	public void updateCourse(int courseId, Courses c) {
		// TODO Auto-generated method stub
		courses.replace(courseId, c);

	}

}
