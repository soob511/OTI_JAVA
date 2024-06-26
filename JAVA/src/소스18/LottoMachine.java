package 소스18;

import java.util.Random;

public class LottoMachine {
	private int[] nums;
	
	public LottoMachine() {
		nums = new int[6];
	}
	
	public void createLottoNums() {
		for(int i=0;i<nums.length;i++) {
			nums[i] = new Random().nextInt(20)+1;
		}
	}
	
	public void checkLottoNums() throws DuplicateException {
		boolean[] check = new boolean[21];
		for(int i=0;i<nums.length;i++) {
			if(check[nums[i]]) {
				throw new DuplicateException();
			}else {
				check[nums[i]] = true;
			}
		}
	}
	
	public int[] getNums() {
		return nums;
	}
	
	

}
