package az.developia.spring_project_14aprel.entity;

public class Book {
	private String name;
	private Integer year;
	
	public Book(String name, Integer year) {
		super();
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", year=" + year + "]";
	}
	
	
}
