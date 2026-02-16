package generic;

public class NewGenericClass<T> {
	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	public void changValue(T newValue) {
		this.t = newValue;
	}
}
