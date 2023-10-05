package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PriceInfo{
	private String model;
	private int price;
	
	public String getModel() {
		return model;
	}

	public PriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public int getPrice() { return price; }
}

public class FirstStreamExam {

	public static void main(String[] args) {
		List<PriceInfo> list = new ArrayList<PriceInfo>();
		list.add(new PriceInfo("Toy", 500));
		list.add(new PriceInfo("Robot", 1500));
		list.add(new PriceInfo("Box", 700));
		
		int sum = list.stream().filter(p -> p.getPrice()>500).mapToInt(t -> t.getPrice()).sum();
		//System.out.println(sum);
		/*
		 0. List 데이터 3개 추가
		 1. PriceInfo 클래스 멤버변수 model getter 생성
		 2. 필터링 조건 : model이 참조하는 문자열 길이가 4이상이면 해당 인스턴스 통과
		 3. 맵핑 방법 : PriceInfo 인스턴스 -> String 인스턴스(모델링)
		 4. forEach로 2,3조건 만족하는 인스턴스만 출력
		 */
		
		List<PriceInfo> list1 = new ArrayList<PriceInfo>(Arrays.asList(new PriceInfo("Toy", 100)));
		list1.add(new PriceInfo("Robot", 1500));
		list1.add(new PriceInfo("Box", 1500));
		list1.add(new PriceInfo("jajaja", 1500));
		list1.add(new PriceInfo("lslslsl", 1500));
		list1.add(new PriceInfo("Boxx", 1500));
		list1.stream().filter(m -> m.getModel().length()>5).map(l -> l.getModel()).forEach(p -> System.out.println(p));
		
	}

}
