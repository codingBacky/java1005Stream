package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

class Student{
	private String name;
	private int java;
	
	
	public Student(String name, int java) {
		this.name = name;
		this.java = java;
	}


	public int getjava() {
		return java;
	}
}
public class StudentStream {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("mimi", 17));
		students.add(new Student("juju", 19));
		students.add(new Student("mina", 16));
		students.add(new Student("lecy", 21));
		
		double avg = students.stream()
			.mapToInt(s -> s.getjava())
			.average()
			.getAsDouble();
		System.out.printf("평균 : %.2f\n", avg);
		
		OptionalDouble avg1 = students.stream()
				.mapToInt(s -> s.getjava()) //Student::getjava
				.average();
		System.out.println(avg1);
		
		System.out.println(avg1.getAsDouble());
		
		
	}

}
