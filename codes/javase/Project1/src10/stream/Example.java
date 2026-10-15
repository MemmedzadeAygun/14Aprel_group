package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
	public static void main(String[] args) {
//			Stream<String> of = Stream.of();
//			System.out.println(of);

//		Stream<Integer> of = Stream.of(1, 2, 3);
//		System.out.println(of);

//		Stream<Object> ofNullable = Stream.ofNullable(null);

		// terminal operations

		// filter
//		Stream<String> stream = Stream.of("monkey", "dog", "horse", "hamster");
//		stream
//		.filter(x -> x.startsWith("h"))
//		.map(animal -> animal.length())
//		.forEach(x -> System.out.println(x));

//		List<String> one = List.of();
//		List<String> two = List.of("monkey");
//		List<String> three = List.of("parrot", "swallow", "horse");
//		
//		Stream<List<String>> animals = Stream.of(one, two, three);
//		animals
//		.flatMap(x -> x.stream()) //["monkey", "parrot", "swallow", "horse"]
//		.forEach(x -> System.out.println(x));

		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 6, 2, 9, 3));
//		numbers.stream()
//		.sorted()
//		.distinct()
//		.forEach(System.out::println);

//		long count = numbers.stream()
//				.sorted()
//				.distinct()
//				.filter(number -> number > 2)
//				.count();
//
//		System.out.println(count);
		
		Integer reduce = numbers.stream()
				.sorted()
				.distinct()
				.filter(number -> number > 2)
				.reduce(0, (a, b) -> (a + b));
		
		System.out.println(reduce);
	}
}
