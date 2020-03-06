package com.cg.UniversityAdmission.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.cg.UniversityAdmission.dao.CoursesDAOImpl;
import com.cg.UniversityAdmission.model.Courses;

public class CourseServiceImpl implements CourseService {
	
private CoursesDAOImpl dao;
	
	public CourseServiceImpl()	{
		super();
		dao= new CoursesDAOImpl();
	}

	private final int generateCourseId() {
		
		return (int) (Math.random()*300);
	}

	@Override
	public int addCourses(Courses course) {
		// TODO Auto-generated method stub
		int courseId = generateCourseId();
		course.setCourseId(courseId);
		dao.addCourses(courseId, course);
		return courseId;
	}

	@Override
	public void updateCourses(int courseId, Courses course) {
		// TODO Auto-generated method stub
		dao.updateCourse(courseId, course);
		
	}

	@Override
	public void deleteCourses(int courseId) {
		// TODO Auto-generated method stub
		dao.deleteCourse(courseId);
		
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return dao.getCourse().stream().collect(Collectors.toList());
	}

	@Override
	public Courses searchCourses(int key) {
		// TODO Auto-generated method stub
		return dao.searchCourse(key);
	}

}
