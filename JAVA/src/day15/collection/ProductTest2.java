package day15.collection;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;

public class ProductTest2 {

	public static void main(String[] args) {
		LinkedList<Product2> list = new LinkedList<>();

		list.add(new Product2("p100", "TV", "20000"));
		list.add(new Product2("p200", "Computer", "10000"));
		list.add(new Product2("p100", "MP3", "700"));
		list.add(new Product2("p300", "Audio", "1000"));

		Collections.sort(list);
		System.out.println("제품ID\t제품명\t\t가격");
		System.out.println("-".repeat(30));
		for(Product2 p2 : list) {
			System.out.println(p2);
		}
		LocalDate targetDate = LocalDate.of(1998, 05, 11);
		System.out.println("듀크는 "+targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN)+"에 태어났어요");
			
	}

}