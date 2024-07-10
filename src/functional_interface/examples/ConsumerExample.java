package functional_interface.examples;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		Consumer<Integer> printEven = number -> {
			if(number % 2 == 0) {
				System.out.print(number +" ");
			}
		};
		
//		numbers.stream().filter(new Predicate<Integer>(){
//
//			@Override
//			public boolean test(Integer n) {
//				return n %2 == 0 ;
//			}
//			
//		}).forEach(n -> {
//				if( n %2 == 0 ) {					
//					System.out.println(n);
//				} 
//			});
		
		numbers.stream()
		.filter(n -> n %2 == 0)
		.forEach(System.out::println);
				
	
	}
	

}


