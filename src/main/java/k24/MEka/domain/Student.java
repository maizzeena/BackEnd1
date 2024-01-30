package k24.MEka.domain;

public class Student {

	private String firstName, lastName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	/*@RequestMapping("hello")
	@ResponseBody
	public String returnHello (@RequestParam (name="location", required=false) String location, 
			@RequestParam (name="name", required=false) String name) {
		return "Welcome to the " + location + " " + name + "!";
	}*/
}
