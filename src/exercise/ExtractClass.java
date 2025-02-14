package exercise;
public class ExtractClass {
//extract class TelephoneNumber from class Person
//DONE
	class Person {
	  private String name;
	  private TelephoneNumber telephoneNumber;

	  public String getName() {
		return name;
	  }

	  public TelephoneNumber getTelephoneNumber() {
		  return telephoneNumber;
	  }
	  
	}
	
	
	class TelephoneNumber{
		private String officeAreaCode;
		private String officeNumber;
		
		
		public String getTelephoneNumber() {
			return ("(" + officeAreaCode + ") " + officeNumber);
		}
		
		public String getOfficeAreaCode() {
			return officeAreaCode;
		}
		public void setOfficeAreaCode(String arg) {
			officeAreaCode = arg;
		}
		public String getOfficeNumber() {
			return officeNumber;
		}
		public void setOfficeNumber(String arg) {
			officeNumber = arg;
		}
		
		
	}
	
}