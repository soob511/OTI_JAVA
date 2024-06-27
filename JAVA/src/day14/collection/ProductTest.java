package day14.collection;

import java.util.HashSet;

public class ProductTest {

	public static void main(String[] args) {
		HashSet<Product> hash = new HashSet<>();

		print(hash, new Product("p100", "TV", "20000"));
		print(hash, new Product("p200", "Computer", "10000"));
		print(hash, new Product("p100", "MP3", "700"));
		print(hash, new Product("p300", "Audio", "1000"));

		System.out.println("제품ID\t제품명\t\t가격");
		System.out.println("-".repeat(30));
		for (Product p : hash) {
			System.out.printf("%s\t%-10s\t%-8s\n", p.getProductID(), p.getProductName(), p.getProductPrice());
		}
	}

	public static void print(HashSet<Product> hash, Product p) {
        if (hash.add(p)) {
            System.out.println("성공적으로 저장되었습니다.");
        } else {
            System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
        }
    }
}