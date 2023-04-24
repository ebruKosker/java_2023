package demo.entity;

public class Course  {

	private String courseName;
	private int price;
	private int percentage;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) throws Exception  {
		if (price >= 0)
			this.price = price;
		else
			throw new Exception("Kurs ücreti 0'dan Küçük olamaz");
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
