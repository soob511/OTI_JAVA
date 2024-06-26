package collection;

public class Product2 implements Comparable<Product2>{
	private String productID;
	private String productName;
	private String productPrice;

	public Product2(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	@Override
	public int compareTo(Product2 o) {
		if(Integer.parseInt(productPrice)<Integer.parseInt(o.productPrice))return 1;
		else if(Integer.parseInt(productPrice)==Integer.parseInt(o.productPrice))return 0;
		else return -1;
	}


	@Override
	public String toString() {
		return String.format("%s\t%-10s\t%,d원",productID,productName,Integer.parseInt(productPrice));
	}

}
