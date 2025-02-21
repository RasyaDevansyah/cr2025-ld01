package exercise;

public class MethodObject {

	class Account {
		private int delta() {
			return 10;
		}
		// replace this gamma method with method object (make a class for the gamma logic)  
		//Done
		public int gamma(int inputVal, int quantity, int yearToDate) {
            return new Gamma(inputVal, quantity, yearToDate).compute();
        }
		
		class Gamma {
            private final int inputVal;
            private final int quantity;
            private final int yearToDate;

            public Gamma(int inputVal, int quantity, int yearToDate) {
                this.inputVal = inputVal;
                this.quantity = quantity;
                this.yearToDate = yearToDate;
            }

            public int compute() {
                int importantValue1 = (inputVal * quantity) + Account.this.delta();
                int importantValue2 = (inputVal * yearToDate) + 100;
                if ((yearToDate - importantValue1) > 100) {
                    importantValue2 -= 20;
                }
                int importantValue3 = importantValue2 * 7;
                return importantValue3 - 2 * importantValue1;
            }
        }

	}
	private void test() {
		Account account = new Account();
		System.out.println(account.gamma(15,10,2010));
		
	}
	public static void main(String[] args) {
		MethodObject p = new MethodObject();
		p.test();
	}

}
