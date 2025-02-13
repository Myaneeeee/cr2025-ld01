package exercise;

public class ExtractSubClass {
// todo: extract subclass PartsItem & LaborItem from JobItem
	class JobItem {
        private int quantity;

        public JobItem(int quantity) {
            this.quantity = quantity;
        }

        public int getTotalPrice() {
            return quantity * getUnitPrice();
        }

        public int getQuantity() {
            return quantity;
        }

        public int getUnitPrice() {
            throw new UnsupportedOperationException("Must be implemented in subclasses");
            // atau bisa ubah ini jadi abstract class aja
        }
    }

    class LaborItem extends JobItem {
        private Employee employee;

        public LaborItem(int quantity, Employee employee) {
            super(quantity);
            this.employee = employee;
        }

        @Override
        public int getUnitPrice() {
            return employee.getRate();
        }

        public Employee getEmployee() {
            return employee;
        }
    }

    class PartsItem extends JobItem {
        private int unitPrice;

        public PartsItem(int quantity, int unitPrice) {
            super(quantity);
            this.unitPrice = unitPrice;
        }

        @Override
        public int getUnitPrice() {
            return unitPrice;
        }
    }


	class Employee {
		private int rate;

		public Employee(int rate) {
			this.rate = rate;
		}

		public int getRate() {
			return rate;
		}
	}

	public void action() {
		Employee kent = new Employee(50);
		JobItem j1 = new LaborItem(5, kent);
        JobItem j2 = new PartsItem(15, 10);
		int total = j1.getTotalPrice() + j2.getTotalPrice();
		System.out.println(total);
	}

	public static void main(String[] args) {
		new ExtractSubClass().action();
	}
}