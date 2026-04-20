package test;

public class Students {
	private String name;
	private int score;
	
	public Students(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
}
