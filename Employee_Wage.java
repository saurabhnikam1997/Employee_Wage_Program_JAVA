
public class Employee_Wage {

	public static void main(String[] args) {
		//Welcome Message//
		System.out.println("Welcome TO Employee Wage Computation Program");

		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;

		int EMP_HOURS = 0;
		int EMP_WAGE = 0;

                double empCheck = Math.floor(Math.random() * 10) % 3;

		if (empCheck == IS_PART_TIME)
			EMP_HOURS = 4;

                else if (empCheck == IS_FULL_TIME)
        	        EMP_HOURS = 8;

		else
			EMP_HOURS = 0;

		EMP_WAGE = EMP_HOURS * EMP_RATE_PER_HOUR;
		System.out.print( "EMPLOYEE WAGE: " + EMP_WAGE );

		}
}
