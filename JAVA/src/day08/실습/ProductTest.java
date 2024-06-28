package day08.실습;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		name = "듀크인형";
		balance = 5;
		price = 10000;
	}

	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getBalance() {
		return balance;
	}

	int getPrice() {
		return price;
	}
}

public class ProductTest {
	public static void main(String[] args) {
		Product[] p = {
				new Product("노트북",2,1000000),
				new Product("커피",10,3000),
				new Product("키보드",2,200000),
				new Product("마우스",2,25000),
				new Product()
		};
				
		for(int i=0;i<5;i++) {
			System.out.println("상품명:"+p[i].name+" 재고량:"+p[i].balance+" 가격:"+String.format("%,d원",p[i].price));
		}
	}
}
