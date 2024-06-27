package day13.실습18;

public class LottoGame {

	public static void main(String[] args) throws DuplicateException {
		LottoMachine lm = new LottoMachine();
		lm.createLottoNums();
		try {
			lm.checkLottoNums();
			day8.MethodTest7.printArray(lm.getNums());
		}catch(DuplicateException e){
			System.out.println(e.getMessage());
		}
	}

}
