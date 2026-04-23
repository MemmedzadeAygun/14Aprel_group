package extra;

public class Main {

	public static void main(String[] args) {

//		Blockable user = new Blockable() {
//			
//			@Override
//			public void block(String a) {
//				System.out.println();
//			}
//		};

		// lambda exp
//		Blockable user = (a) ->  System.out.println("Istifadeci bloklandi " + a);
//		Blockable user = (a, b) ->  System.out.println("Istifadeci bloklandi " + a);
//		Blockable user = (a, b) -> {
//			System.out.println("Istifadeci bloklandi " + a);
//			System.out.println(b);
//		};
//
//		user.block("Eli", 12);
		
//		doIt(user);
		
		doIt((a, b) -> {
			System.out.println("Istifadeci bloklandi " + a);
			System.out.println(b);});
	}
	
	public static void doIt(Blockable b) {
		b.block("Ehmed", 10);
	}

}
