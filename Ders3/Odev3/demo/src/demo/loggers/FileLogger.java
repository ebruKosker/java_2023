package demo.loggers;

public class FileLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logger to file :"+message);
	}

}
