
public class Employee_Wage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;


        public static void main(String[] args) {
                //Welcome Message//
                System.out.println("Welcome TO Employee Wage Computation Program");


                int EMP_HOURS = 0;
                int EMP_WAGE = 0;
		int TOTAL_EMP_WAGE = 0;

		for ( int day=0; day < NUM_OF_WORKING_DAYS; day++ ) {
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
        	        	EMP_WAGE = EMP_HOURS * EMP_RATE_PER_HOUR;
				TOTAL_EMP_WAGE += EMP_WAGE;
	                	System.out.print( "\n EMPLOYEE WAGE: " + EMP_WAGE );
                }
		System.out.println("\n Total_Employee_Wage: " + TOTAL_EMP_WAGE );

	}
}
