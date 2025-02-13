package exercise;

public class ExtractClass {

	// Extracted TelephoneNumber class
	class TelephoneNumber {
		private String officeAreaCode;
		private String officeNumber;

		public String getOfficeAreaCode() {
			return officeAreaCode;
		}

		public void setOfficeAreaCode(String officeAreaCode) {
			this.officeAreaCode = officeAreaCode;
		}

		public String getOfficeNumber() {
			return officeNumber;
		}

		public void setOfficeNumber(String officeNumber) {
			this.officeNumber = officeNumber;
		}

		public String getTelephoneNumber() {
			return "(" + officeAreaCode + ") " + officeNumber;
		}
	}

	// Updated Person class
	class Person {
		private String name;
		private TelephoneNumber telephoneNumber = new TelephoneNumber();

		public String getName() {
			return name;
		}

		public String getTelephoneNumber() {
			return telephoneNumber.getTelephoneNumber();
		}

		public String getOfficeAreaCode() {
			return telephoneNumber.getOfficeAreaCode();
		}

		public void setOfficeAreaCode(String officeAreaCode) {
			telephoneNumber.setOfficeAreaCode(officeAreaCode);
		}

		public String getOfficeNumber() {
			return telephoneNumber.getOfficeNumber();
		}

		public void setOfficeNumber(String officeNumber) {
			telephoneNumber.setOfficeNumber(officeNumber);
		}
	}
}
