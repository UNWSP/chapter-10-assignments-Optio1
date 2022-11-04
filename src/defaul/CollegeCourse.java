package defaul;

public class CollegeCourse {
	public String department;
	public int courseNumber;
	public int credits;
	public final int CREDITCOST = 120;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public void display() {
		int cost = ( credits * CREDITCOST );
		System.out.println("The course " + department + courseNumber + " is " + credits + " credits and costs $" + cost);
	}
}
