package day17;

public class Book {
	String title;
	String author;
	int price;

	public Book() {
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getBookInfo() {
		return String.format("%-20s%-10s%d",title,author,price);
	}

	public int getPrice() {
		return price;
	}


}
