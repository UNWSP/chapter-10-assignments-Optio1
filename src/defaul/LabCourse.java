package defaul;

public class LabCourse extends CollegeCourse{
	
	@Override
	public void display() {
		int cost = ( credits * CREDITCOST ) + 50;
		System.out.println("The course " + department + courseNumber + " is " + credits + " credits and costs $" + cost);
	}
	
}
