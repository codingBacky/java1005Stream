package ex03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReduceExam3 {

	public static void main(String[] args) {
	
		List<String> words = Arrays.asList("apple","strawberry","mango","cherry","pineapple");
		
		List<String> list = words.stream()
			.filter(s->s.length()>5)
			.collect(Collectors.toList());//수집해서 list에게 넘겨줌
		
		System.out.println(list);
	
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//짝수와  홀수를 그룹화하여 맵에 저장
		
		Map<String, List<Integer>> evenOddMap = numbers.stream()
				.collect(Collectors.groupingBy(n -> n%2 == 0? "짝수":"홀수"));
		
		System.out.println("짝수 : " + evenOddMap.get("짝수"));
		System.out.println("홀수 : " + evenOddMap.get("홀수"));
	}
	

}
