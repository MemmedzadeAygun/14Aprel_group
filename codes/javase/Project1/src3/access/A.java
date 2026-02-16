package access;

//1.sinifler ancaq public, default modifikatorda ola biler
//2.deyisenlerde modifikatorlar public, private, default ve protected olur
//3.metodlarda modifikatorlar public, private, default ve protected olur


public class A {

	public int age;
	
	public A() {
		this.age = 25;
	}
	
	public void showInfo() {
		int result = age + 10;
		System.out.println(age);
	}
	
	public int returnAge() {
		int result = 12;
		return result;
	}
}
