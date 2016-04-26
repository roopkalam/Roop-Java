package classesexample;

//import classesexample.Student;

public class AssignAddressToStudent {

	public static void main(String[] args) {

		Student studMeena = new Student();
		studMeena.studName = "Meena";
		studMeena.studId = 24;
		studMeena.studGrade = "Sixth";
		
		// CODE STARTS HERE
		studMeena.address = new Address();
		studMeena.address.addressOne = "123,Laurel Heights";
		studMeena.address.state = "GA";
		studMeena.address.country = "USA";
		// Please check on this if this works !!!...
		studMeena.address.state = "North Carolina";
		// CODE ENDS HERE
		
		System.out.println(studMeena.address.country);
		System.out.println(studMeena.address.state);
		System.out.println(studMeena.address.addressOne);
		
	}
}