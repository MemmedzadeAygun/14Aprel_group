package generic;

public class MainClass4 {
	public static void main(String[] args) {
		NewGenericClass<String> g1 = new NewGenericClass<String>();
		g1.setT("Aygun");
		
		NewGenericClass<String> g2 = new NewGenericClass<String>();
		g2.setT("Nigar");
		
		GenericMethod m = new GenericMethod();
		System.out.println(m.isEquals(g1, g2));
		
		
		
		NewGenericClass<Integer> g3 = new NewGenericClass<Integer>();
		g3.setT(45);
		
		NewGenericClass<Integer> g4 = new NewGenericClass<Integer>();
		g4.setT(45);
		
		System.out.println(m.isEquals(g3, g4));
	}
}
