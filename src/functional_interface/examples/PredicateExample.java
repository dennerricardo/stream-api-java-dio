package functional_interface.examples;

import java.util.Arrays;
import java.util.List;


public class PredicateExample {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java","Kotlin","Python","JavaScript", "C++", "C#","Go", "Ruby");
	
//		Predicate<String> moreThanFiveCharacteres = word -> word.length() > 5;
		
//		words.stream().filter(moreThanFiveCharacteres).forEach(System.out::println);

//		words.stream().filter(new Predicate<String>() {
//
//			@Override
//			public boolean test(String w) {
//				return w.length() > 5;
//			}
//		}).forEach(System.out::println);
		
		words.stream().filter(w -> w.length() < 5).forEach(System.out::println);
	}
}
