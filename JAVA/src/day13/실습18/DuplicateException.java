package day13.실습18;

public class DuplicateException extends Exception{
	public DuplicateException() {
		super("중복된 로또 번호가 발생됐습니다.");
	}
}
