package demo.dataAccess;

import demo.entity.Instructor;

public  class InstructorDao {


	public void add(Instructor instructor) {
		System.out.println("Eğitmen eklendi : "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

	public void delete(Instructor instructor) {
		System.out.println("Eğitmen silindi : "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

	public void update(Instructor instructor) {
		System.out.println("Eğitmen güncellendi : "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}
	

}
