package stream;

import java.util.Optional;

public class Main2 {
	public static void main(String[] args) {
			Optional<String> empty = Optional.empty();
//			System.out.println(empty.get());
//			System.out.println(empty.orElse("Veli"));
		
		Optional<String> of = Optional.of("Salam");
		Optional<String> result = of.map(x -> x.toUpperCase());
		System.out.println(of.get());
		System.out.println(result.get());
		
//		Optional<Object> ofNullable = Optional.ofNullable(null);
//		System.out.println(ofNullable);
	}
}
