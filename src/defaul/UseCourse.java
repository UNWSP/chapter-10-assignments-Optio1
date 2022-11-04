package defaul;
import java.util.Scanner;
public class UseCourse {

	public static void main(String[] args) {
		final String[] DEPARTMENTS = { "bio", "chm", "cis", "phy" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the department.");
	    String department = scanner.nextLine();
	    for (String dept : DEPARTMENTS) {
	    if ( department.toLowerCase().equals(dept)) {
	    	System.out.println("hjk");
	    	LabCourse course = new LabCourse();
	    	course.setDepartment(department);
	    	System.out.println("Please enter the number of credits.");
		    int credits = scanner.nextInt();
		    System.out.println("Please enter the course code.");
		    int code = scanner.nextInt();
		    course.setCourseNumber(code);
		    course.setCredits(credits);
		    course.display();
		    System.exit(1);
	    }}
	    	CollegeCourse course = new CollegeCourse();
	    	course.setDepartment(department);
	    	System.out.println("Please enter the number of credits.");
		    int credits = scanner.nextInt();
		    System.out.println("Please enter the course code.");
		    int code = scanner.nextInt();
		    course.setCourseNumber(code);
		    course.setCredits(credits);
		    course.display();
	    
	}

}
