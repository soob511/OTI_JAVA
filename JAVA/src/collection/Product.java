package collection;

import java.util.Objects;

public class Product{
	private String productID;
	private String productName;
	private String productPrice;

	public Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productID, other.productID);
				
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	
	

}
