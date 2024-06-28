package day08;

public class Book{
	String title;
	String author;
	int price;
	
	public Book(){
		title = "이것이 자바다";
		author = "신용권";
		price = 38000;
		
	}
	public Book(String title,String author,int price){
		this.title =title;
		this.author = author;
		this.price = price;
	}
	public String getBookInfo() {
		return ("책이름:"+title+" 저자:"+author+" 가격:"+price);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
