package demo;
import java.util.ArrayList;

import demo.business.CategoryManager;
import demo.business.CourseManager;
import demo.business.InstructorManager;
import demo.entity.Category;
import demo.entity.Course;
import demo.entity.Instructor;
import demo.loggers.BaseLogger;
import demo.loggers.DatabaseLogger;
import demo.loggers.FileLogger;
import demo.tools.Hibernate;
import demo.tools.Jdbs;

public class Main {

	public static void main(String[] args) throws Exception {
		  BaseLogger[] loggers = {new DatabaseLogger(), new FileLogger()};
		  System.out.println("*************************************************************************************************************");
	        Category category1 = new Category();
	        category1.setId(5);
	        category1.setCategoryName("lfşsdi,sd");
	        
	        Category category2 = new Category();
	        category1.setId(2);
	        category1.setCategoryName("lşddsfiasdf");
	        
	        ArrayList<Category> categoryList = new ArrayList<Category>();
	        CategoryManager categoryManager = new CategoryManager(new Hibernate(),loggers, categoryList);
	        categoryManager.add(category1);
	        categoryManager.add(category2);
	        
	        System.out.println("*************************************************************************************************************");
	        
	        Course course1 = new Course();
	        course1.setId(5);
	        course1.setCourseName("Java");
	        course1.setPrice(10);
	        course1.setPercentage(80);
	        
	        Course course2 = new Course();
	        course2.setId(3);
	        course2.setCourseName("c#");
	        course2.setPrice(50);
	        course2.setPercentage(70);
	        
	        ArrayList<Course> courseList = new ArrayList<Course>();
	        CourseManager courseManager = new CourseManager(new Jdbs(),loggers, courseList);
	        courseManager.add(course1);
	        courseManager.add(course2);

	        System.out.println("*************************************************************************************************************");
	        
	        Instructor instructor1 = new Instructor();
	        instructor1.setId(5);
	        instructor1.setFirstName("Engin");
	        instructor1.setLastName("Demirog");
	        
	        Instructor instructor2 = new Instructor();
	        instructor1.setId(7);
	        instructor1.setFirstName("Engin");
	        instructor1.setLastName("Demirog");
	        ArrayList<Instructor> instructorList = new ArrayList<Instructor>();
	        InstructorManager instructorManager = new InstructorManager(new Hibernate(), loggers, instructorList);
	        instructorManager.add(instructor1);
	        instructorManager.add(instructor2);
	        
	        System.out.println("*************************************************************************************************************") ;

	}

}
