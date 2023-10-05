package ex03;

import java.util.Arrays;
import java.util.List;

public class ReduceExam2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		/*
		 홀수 곱을 계산하는 스트림식을 구현
		 filter와 reduce를 사용
		 */
		int num = numbers.stream().filter(n-> n%2 == 1).reduce(1,(a,b)->a*b);
		System.out.println(num);
		/*
		 
		 */
		
		
	}
	

}
