package demo.dataAccess;

import demo.entity.Course;

public class CourseDao{
	
	
	public void add(Course course) {
		System.out.println("Kurs eklendi : "+course.getCourseName());
		
	}

	
	public void delete(Course course) {
		System.out.println("Kurs silindi : "+course.getCourseName());
		
	}

	
	public void update(Course course) {
		System.out.println("Kurs Güncellendi : "+course.getCourseName());
		
	}

}
