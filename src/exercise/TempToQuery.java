package exercise;

public class TempToQuery {
	class Product {
		private int quantity;
		private int itemPrice;
		public Product(int quantity, int price) {
			this.quantity = quantity;
			this.itemPrice = price;
		}
		
		//change this method to using replace temp with query
		//Done
		public double getPrice() {
			return basePrice() * discountFactor();
		}
		
		double discountFactor() {
			return basePrice() > 1000 ? 0.95 : 0.98;
		}
		
		double basePrice() {
			return quantity * itemPrice;
		}
	}
	public void Test() {
		Product p1 = new Product(100, 200);
		Product p2 = new Product(10, 50);
		System.out.println("Price 1 = " + p1.getPrice());
		System.out.println("Price 2 = " + p2.getPrice());
	}
	public static void main(String[] args) {
		TempToQuery t = new TempToQuery();
		t.Test();
	}
}
