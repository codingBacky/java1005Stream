package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReduceExam {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		 int sum = numbers.stream()
		 	.reduce(0, (a,b)-> a+b);
		 System.out.println("sum: " + sum);
		
		 List<String> words = Arrays.asList("apple","mango","cherry","peach","strawberry");
		 
		 Integer totalLength =  words.stream()
		 	.map(s -> s.length())
		 	.reduce(0, (a,b)-> a+b);
		 
		 System.out.println(totalLength);
		 
		 List<Integer> nums = new ArrayList<Integer>();
		 
		 for(int i = 0; i < 10; i++) {
			 nums.add((int)(Math.random()*100));
		 }
		 for(Integer i : nums)
			 System.out.print(i +" ");
			 
		 int max = nums.stream()
		 	.reduce(Integer.MIN_VALUE, (a,b)->Integer.max(a, b));//Integer.MIN_VALUE 대신 0
		 
		 System.out.println("max : " + max);
		 
		 List<String> word = Arrays.asList("Hello", " ", "World", "!");
		 String combind = word.stream().reduce("",(a,b) -> a+b);
		 System.out.println(combind);
		 
		 
		 Integer[] arr = {1, 26, 17, 25, 99, 44, 303};
		 Arrays.sort(arr, (i1, i2) -> i2 - i1);
		 System.out.println("Sorted arr[] : " + Arrays.toString(arr));
	}
	

}
