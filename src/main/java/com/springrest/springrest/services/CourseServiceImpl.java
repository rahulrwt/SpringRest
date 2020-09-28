package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service

public class CourseServiceImpl implements CourseService {

//	List<Course> list;
@Autowired
private CourseDao courseDao;
	public CourseServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Course(145,"java Course course","this course contains basic of java"));
//		list.add(new Course(146,"spring boot","creating rest api"));
	}
	@Override

	public List<Course> getCourses() {
		
	return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(Long id)

	{
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==id)
//			{
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(id);
	}
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
		
	}
	@Override
	public Course updateCourse(Course course) {
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).getId()==course.getId())
//			{
//				list.set(i,course);
//			}
//		}
		courseDao.save(course);
		return course;
	}
	@Override
	public Course deleteCourse(long courseId) {
		
//		Course c=null;
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).getId()==courseId)
//			{
//				c=list.get(i);
//				list.remove(i);
//			}
//		}
		Course entity=courseDao.getOne(courseId);
		courseDao.delete(entity);
		return entity;
		
	}
	
}
