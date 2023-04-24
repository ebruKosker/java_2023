package demo.business;

import java.util.ArrayList;

import demo.dataAccess.CourseDao;
import demo.entity.Course;
import demo.loggers.BaseLogger;
import demo.tools.ORM;

public class CourseManager  {

	 private final ORM oRM;
	    private final BaseLogger[] loggers;
	    private ArrayList<Course> courses;

	    public CourseManager(ORM oRM, BaseLogger[] loggers, ArrayList<Course> course) {
	        this.oRM = oRM;
	        this.loggers = loggers;
	        this.courses = course;
	    }

	    public void add(Course course) throws Exception {
	        for (Course course1 : courses) {
	            if (course1.getCourseName() == course.getCourseName()) {
	                throw new Exception("Kategori zaten var !");
	            }
	        }
	        oRM.creating();
	        courses.add(course);

	        for (BaseLogger logger : loggers) {
	            logger.log(course.getCourseName());
	        }
	    }

}
