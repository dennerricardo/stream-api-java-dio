package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionExample {
	
	public static void main(String[] args) {		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
//		Function<Integer, Integer> multiplyForTwo = number -> number * 2;
		
//		List<Integer> numbersResult = numbers.stream().map(multiplyForTwo).collect(Collectors.toList());
		
//		List<Integer> numbersResult = numbers.stream().map(
//				new Function<Integer, Integer>() {
//
//					@Override
//					public Integer apply(Integer n) {
//						// TODO Auto-generated method stub
//						return n * 2;
//					}
//					
//				}
//				
//				).collect(Collectors.toList());
		
		List<Integer> numbersResult = numbers.stream().map(n -> n *2).collect(Collectors.toList());
		
//		List<Integer> numbersResult = numbers.stream().map(multiplyForTwo).toList();
		
//		numbersResult.forEach(n -> System.out.println(n));
		numbersResult.forEach(System.out::println);
	}
}
