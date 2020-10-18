
public class Employee_Wage {

	public static void main(String[] args) {
		//Welcome Message//
		System.out.println("Welcome TO Employee Wage Computation Program");

		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;

		int EMP_HOURS = 0;
		int EMP_WAGE = 0;

                double empCheck = Math.floor(Math.random() * 10) % 2;

		if ( empCheck == IS_FULL_TIME)
                        EMP_HOURS = 8;
                else
                        EMP_HOURS = 0;
		EMP_WAGE = EMP_HOURS * EMP_RATE_PER_HOUR;
		System.out.print( "EMPLOYEE WAGE: " + EMP_WAGE );

		}
}
