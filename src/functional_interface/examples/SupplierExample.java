package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

	public static void main(String[] args) {
		
		
		List<String> sentencesList = Stream.generate(new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Hello, welcome to the LIST SENTENCE";
			}
		}).limit(2).collect(Collectors.toList());
		
		sentencesList.forEach(System.out::println);
		
		//
		Supplier<String> sentence = () -> "Hello, welcome to the LIST SENTENCE 1";
		List<String> sentencesList1 = Stream.generate(sentence).limit(3).collect(Collectors.toList());
		sentencesList1.forEach(System.out::println);
		// 
		
		List<String> sentencesList2 = Stream.generate(() -> "Hello, welcome to the LIST SENTENCE 2").limit(5).collect(Collectors.toList());
		sentencesList2.forEach(System.out::println);
	}
}
