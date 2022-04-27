package labs;

public class Lab2 {

	public static void main(String[] args) {
		// Create a student
		Student stu1 = new Student("Janelle", "123457896");
		Student stu2 = new Student("Jim", "123453496");
		Student stu3 = new Student("Jake", "126756896");
		
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
		//stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

class Student{
	// Properties
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = " ";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
		System.out.println("Your email: " + email);

	}
	
	public String getEmail() {
		return email;
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your user Id: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
	}
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
	}
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	public void showCourses() {
		System.out.println(courses);
	}
	public String toString() { 
		return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: " + balance + "]"; 
	}	
}