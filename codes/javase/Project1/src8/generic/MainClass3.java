package generic;

public class MainClass3 {
	public static void main(String[] args) {
		NewGenericClass<String> g1 = new NewGenericClass<String>();
		g1.setT("Esma");
		g1.changValue("Esmer");
		
		System.out.println(g1.getT());
		
		NewGenericClass<Integer> g2 = new NewGenericClass<Integer>();
		g2.setT(12);
		g2.changValue(34);
		
		System.out.println(g2.getT());
		
		NewGenericClass<Person> g3 = new NewGenericClass<Person>();
		Person person = new Person();
		person.setName("Guler");
		g3.setT(person);
		
		Person person2 = new Person();
		person2.setName("Xedice");
		
		g3.changValue(person2);
		
		System.out.println(g3.getT());
	}
}
