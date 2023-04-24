package demo.business;

import java.util.ArrayList;
import demo.dataAccess.InstructorDao;
import demo.entity.Instructor;
import demo.loggers.BaseLogger;
import demo.tools.ORM;

public class InstructorManager {
	private final ORM oRM;
	private final BaseLogger[] loggers;
	private ArrayList<Instructor> instructors;

	public InstructorManager(ORM oRM, BaseLogger[] loggers, ArrayList<Instructor> instructors) {
		this.oRM = oRM;
		this.loggers = loggers;
		this.instructors = instructors;
	}

	public void add(Instructor instructor) throws Exception {
		for (Instructor instructor1 : instructors) {
			if (instructor1.getFirstName() == instructor.getFirstName()
					&& instructor1.getLastName() == instructor1.getLastName()) {
				throw new Exception("Kategori zaten var !");
			}
		}
		oRM.creating();
		;
		instructors.add(instructor);

		for (BaseLogger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
}
