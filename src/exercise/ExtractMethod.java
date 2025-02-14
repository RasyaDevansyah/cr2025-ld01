package exercise;
import java.util.Enumeration;


public class ExtractMethod {

	public static void main(String[] args) {
		ExtractMethod test = new ExtractMethod("Andi");
		test.printOwing();
	}
	private Order orders;
	private String name;
	public String getName() {
		return name;
	}
	public ExtractMethod(String name) {
		this.name = name;
		orders = new Order();
	}
	//reduce this method with extract method
	//DONE
	void printOwing() {
	  printBanner();
	  printDetail(getOutstanding());
	}
	
	void printBanner() {
		System.out.println ("*****************************");
		System.out.println ("****** Customer totals ******");
		System.out.println ("*****************************");
	}
	
	double getOutstanding() {
		double outstanding = 0.0;
		Enumeration elements = orders.elements();
		while (elements.hasMoreElements()) {
			Order each = (Order) elements.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}
	
	void printDetail(double outstanding) {
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);
	}
	
	
	class Order implements Enumeration {
		private double [] amounts;
		private int currentIndex;
		public Order() {
			amounts = new double[5];
			currentIndex  = 0;
			amounts[0] = 12.0;
			amounts[1] =  2.5;
			amounts[2] =  3.2;
			amounts[3] =  7.05;
			amounts[4] =  6.0;
		}
		
		public boolean hasMoreElements() {
			if(currentIndex < amounts.length) {
				return true;
			}
			return false;
		}

		public Enumeration elements() {
			return this;
		}

		public double getAmount() {
			return amounts[currentIndex - 1];
		}

		public Object nextElement() {
			currentIndex ++;
			return this;
		}
		
	}
}
