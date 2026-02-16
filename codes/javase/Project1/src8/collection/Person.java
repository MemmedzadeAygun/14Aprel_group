package collection;

public class Person implements Comparable{

	private int a;
	
	public Person(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}

	@Override
	public int compareTo(Object o) {
		int a2 = ((Person) o).getA();
		
		return a2 - this.a;
	}

	@Override
	public String toString() {
		return "Person [a=" + a + "]";
	}
	
	
}
