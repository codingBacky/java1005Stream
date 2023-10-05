package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FirstStreamExam {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		
		IntStream stm1 = Arrays.stream(ar);
		IntStream stm2 = stm1.filter( n -> n%2 ==1 );
		int sum = (int) stm2.count();
		System.out.println(sum);
		
		int result = Arrays.stream(ar).filter( n -> n%2 == 0 ).sum();
		System.out.println(result);
		
		System.out.println("------------------------------");
		String[] names = {"Toy", "Box", "Robot","Robot2"};
		
		Arrays.stream(names)
			.filter(s -> s.length()>3)
			.filter(s -> s.length()%2 == 1)
			.forEach(s -> System.out.println(s));
	
		List<String> list = Arrays.stream(names)
			.filter(s -> s.length()>3)
			.filter(s -> s.length()%2 == 1)
			.toList();
		System.out.println("List : " + list);
		
		
		
		
		
		Arrays.stream(names)
			.map(s -> s.length())
			.forEach(s -> System.out.println(s));
		
		int sum2 = Arrays.stream(names)
			.mapToInt(s -> s.length())
			.sum();
		
		System.out.println(sum2);
		
		List<String> str = Arrays.asList("Toy", "Box", "Robot","Robot2");
		
		int sum3 = str.stream().mapToInt(s -> s.length()).sum();
		System.out.println(sum3);
		
		
	}

}
