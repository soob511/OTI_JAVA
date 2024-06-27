package day12.실습17;

public class TVTest {

	public static void main(String[] args) {

		SaleTV stv = new SaleTV(3000000, "SALETV-1", 40, 1);
		RentalTV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		for (int i = 0; i < 2; i++) {
			stv.channelUp();
		}
		for (int i = 0; i < 3; i++) {
			rtv.channelDown();
		}
		printAllTV(stv);
		printAllTV(rtv);
		
		printRentalTV(rtv);
	}

	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		if (tv instanceof SaleTV) {
			//SaleTV stv = (SaleTV)tv;
			//stv.play();
			//stv.sale();
		    ((SaleTV) tv).play();
		    ((SaleTV) tv).sale();
		} else {
		    ((RentalTV) tv).play();
		}

	}

	static void printRentalTV(Rentable tv) {
		tv.rent();
	}

}
