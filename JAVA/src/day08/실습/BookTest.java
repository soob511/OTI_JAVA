package day08.실습;
class Book{
	String title;
	String author;
	int price;
	
	Book(){
		title = "이것이 자바다";
		author = "신용권";
		price = 38000;
		
	}
	Book(String title,String author,int price){
		this.title =title;
		this.author = author;
		this.price = price;
	}
	String getBookInfo() {
		return ("책이름:"+title+" 저자:"+author+" 가격:"+price);
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book("명품java programming","황기태",33000);
		Book b4 = new Book("java의 정석","남궁성",22500);
		Book b5 = new Book();
		
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());

	}

}
