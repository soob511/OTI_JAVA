package day13.실습19;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLab1 {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		boolean[] check = new boolean[31];
		int count =0;
		while(count<10) {
			int num = (int)(Math.random()*21)+10;
			if(!check[num]) {
				count++;
				h.add(num);
				check[num] = true;
			}
		}
		System.out.println("오늘의 로또 번호: ");
		Iterator<Integer> iterator = h.iterator();
		while(iterator.hasNext()) {
			 int n = iterator.next();
				System.out.print(n);
			 if(iterator.hasNext()) {
					System.out.print(",");
			 }
		}

	}

}
