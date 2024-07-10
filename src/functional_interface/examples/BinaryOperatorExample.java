package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);		
//		BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2 ;
		BinaryOperator<Integer> sum = Integer::sum ;
		
//		int result= numbers.stream().reduce(0, sum);
//		int result= numbers.stream().reduce(0, new BinaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer n1, Integer n2) {
//				// TODO Auto-generated method stub
//				return n1 + n2 ;
//			}
//		});
		
//		int result= numbers.stream().reduce(0, (n1 , n2) -> n1 + n2) ;
		int result= numbers.stream().reduce(0, Integer::sum) ;
	

		System.out.println(result);
		
	}
}
