package extra;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		Movie m1 = new Movie("Qaynana",2015);
		Movie m2 = new Movie(null,2014);
		Movie m3 = new Movie("Spiderman",1996);
		Movie m4 = new Movie("Qizmar gunes altinda",2013);
		
		List<Movie> movies = Arrays.asList(m1, m2, m3, m4);
		
//		List<String> movies2 = getMovies(movies);
//		System.out.println(movies2);
		
		getMovies(movies);
		
//		System.out.println(movies.get(1));
		
		
	}

	
//	public static List<String> getMovies(List<Movie> movies){
	public static void getMovies(List<Movie> movies){
		
		Function<Movie, String> func = new Function<Movie, String>() {
			
			@Override
			public String apply(Movie t) {
				return t.getName();
			}
		};
		
		Predicate<String> pre = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.contains("i");
			}
		};
		
		Consumer<String> cons = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
//				System.out::println
				System.out.println(t);
			}
		};
		
//		if (movies.get(1).getName() == null) {
//			throw new RuntimeException("Ad bos ola bilmez");
//		}
		
		Supplier<RuntimeException> supp = new Supplier<RuntimeException>() {
			
			@Override
			public RuntimeException get() {
				return new RuntimeException("Ad bos ola bilmez");
			}
		};
		
		Optional.ofNullable(movies.get(1).getName())
		.orElseThrow(supp);
		
		 movies.stream()
				.map(func)
				.filter(pre)
				.forEach(cons);
		
//		return movies.stream()
//				.map(func)
//				.filter(pre)
//				.collect(Collectors.toList());
		
//		return movies.stream()
//				.map(x -> x.getName())
//				.filter(i -> i.contains("i"))
//				.collect(Collectors.toList());
	}
}
