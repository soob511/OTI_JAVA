package day9.실습;

import java.util.Scanner;

class GradeExpr{
	int[] jumsu;
	
	GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	double getAverage() {
		return getTotal()/jumsu.length;
		
	}
	int getTotal() {
		int sum = 0;
		for(int i=0;i<jumsu.length;i++) {
			sum+=jumsu[i];
		}
		return sum;
	}
	int getGoodScore() {
		int max = jumsu[0];
		for(int i=0;i<jumsu.length;i++) {
			max = Math.max(max,jumsu[i]);
		}
		return max;
	}
	int getBadScore() {
		int min = jumsu[0];
		for(int i=0;i<jumsu.length;i++) {
			min = Math.min(min,jumsu[i]);
		}
		return min;
	}
	
}

public class GradeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("처리하려는 점수의 갯수를 입력하세요:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("입력: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		GradeExpr g = new GradeExpr(arr);	
		System.out.println("총점: "+g.getTotal());
		System.out.println("평균: "+g.getAverage());
		System.out.println("최고 점수: "+g.getGoodScore());
		System.out.println("최저 점수: "+g.getBadScore());
		sc.close();
	}

}
