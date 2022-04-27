package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of The Rings";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("Book contains ring!");
		}
		
		String browser = "Chrome";
		if(browser.contentEquals("Chrome")) {
			System.out.println("Browser is Chrome");
		}

		String firstName = "Jacob";
		String lastName = "Savoie";
		String ssn = "123456789";
		
		System.out.println("There are " + ssn.length() + " digits in your ssn");
		
		//error handle ssn
		if(ssn.length() < 9) {
			System.out.println("Please enter a valid ssn.");
		}
		
		//print the initials and last 4 of ssn
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(" Last four: " + ssn.substring(5));
	}

}
