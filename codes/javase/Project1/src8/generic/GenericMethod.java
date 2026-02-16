package generic;

public class GenericMethod {

	public <T> boolean isEquals(NewGenericClass<T> t1, NewGenericClass<T> t2) {
		return t1.getT().equals(t2.getT());
	}
}
