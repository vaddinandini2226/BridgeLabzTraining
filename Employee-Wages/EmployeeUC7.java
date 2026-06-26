package employee;
public class EmployeeUC7 {
//	Static members
	final static int WAGE_PER_DAY=20;
	final static int WORKING_HOURS=8;
	
//	class methods
	static int calculateWage()
	{
		return WAGE_PER_DAY*WORKING_HOURS;
	}
	public static void main(String[] args) {
		System.out.println("Daily Wage: "+calculateWage());
	}
}
