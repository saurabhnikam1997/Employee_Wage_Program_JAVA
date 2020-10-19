
public class Employee_Wage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100 ;

        public static void main(String[] args) {
                //Welcome Message//
                System.out.println("Welcome TO Employee Wage Computation Program");


                int EMP_HOURS = 0;
		int TOTAL_EMP_HOURS = 0;
		int TOTAL_WORKING_DAYS = 0;
                int EMP_WAGE = 0;
		int TOTAL_EMP_WAGE = 0;

		while (TOTAL_EMP_HOURS <= MAX_HRS_IN_MONTH &&
			TOTAL_WORKING_DAYS < NUM_OF_WORKING_DAYS){
			TOTAL_WORKING_DAYS++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		                switch ((int)empCheck){
		                        case IS_PART_TIME:
                	                	EMP_HOURS = 4;
                        	        	break;

         		               	case IS_FULL_TIME:
                        	        	EMP_HOURS = 8;
                                		break;

                        		default:
                        		        EMP_HOURS = 0;

	                        }
				TOTAL_EMP_HOURS += EMP_HOURS;
				EMP_WAGE = EMP_HOURS * EMP_RATE_PER_HOUR;
				System.out.println("\n Day#: " + TOTAL_WORKING_DAYS +
							"EMPLOYEE_HOURS: " + EMP_HOURS);
				System.out.println("  One_Day_Salary: " + EMP_WAGE);
                }
		TOTAL_EMP_WAGE = TOTAL_EMP_HOURS * EMP_RATE_PER_HOUR;
		System.out.println("\n Total_Salary_Of_Employee: " + TOTAL_EMP_WAGE );

	}
}
