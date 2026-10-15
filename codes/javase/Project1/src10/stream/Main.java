package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		Helper help = new Helper();
//		help.speak("meow");

//		LearnToSpeak learn = new LearnToSpeak() {
//			
//			@Override
//			public void speak(String sound) {
//				System.out.println(sound);
//			}
//		};
//		
//		learn.speak("meow");

//		LearnToSpeak learn =(String sound) -> {
//				System.out.println(sound);
//			};
		
//		LearnToSpeak learn = System.out::println;
//			
//		learn.speak("meow");
		
//		Calculator calc = new Calculator() {
//			
//			@Override
//			public long round(double num) {
//				
//				return Math.round(num);
//			}
//		};
//		
//		calc.round(122.6);
		
//		Calculator calc = (double num) -> Math.round(num);
		Calculator calc = Math::round;
		
		
		
	
//		String::toUpperCase;
		
		List<String> list = new ArrayList<String>();
		list.add("Sexavet");
		list.add("Eli");
		list.add("Xedice");
		
		System.out.println(list);
		
		list.replaceAll(String::toUpperCase);
		
		System.out.println(list);
	}
}
