/*
  	ISYS 320
  	Name(s): Brian Williams
  	Date: 
*/

public class ComputePay {
	public static void main(String[] args) {
		
		int hoursWorked;
		hoursWorked = (4 + 5 + 8 + 4);
		
		double hourlySalary;
		hourlySalary = 8.75;
		
		
		System.out.println("My total hours worked: " + hoursWorked );
		
		System.out.println("My hourly salary: $" + hourlySalary);
		
		System.out.println("My total pay: $" + (hoursWorked * hourlySalary));
	}
}