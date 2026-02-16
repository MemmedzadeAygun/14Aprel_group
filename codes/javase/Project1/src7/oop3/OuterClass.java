package oop3;

public class OuterClass {

	int a;
	int b;
	
	public OuterClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	@Override
	public String toString() {
		return "OuterClass [a=" + a + ", b=" + b + "]";
	}

	public void doIt() {
		 class Inner{
			String text;
		}
		
		Inner i = new Inner();
		i.text = "hello";
		
		System.out.println(i.text);
	}


	public static class InnerClass extends OuterClass{
		int c;
		int d;
		
		public InnerClass(int a, int b,int c, int d) {
			super(a,b);
			this.c = c;
			this.d = d;
		}

		@Override
		public String toString() {
			return "InnerClass [c=" + c + ", d=" + d + ", a=" + a + ", b=" + b + "]";
		}

	}
}
